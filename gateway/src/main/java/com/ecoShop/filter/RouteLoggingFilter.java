package com.ecoShop.filter;

import com.alibaba.fastjson2.JSON;
import com.ecoShop.api.SecurityServiceClient;
import com.ecoShop.dto.UserDetailsDto;
import com.ecoShop.utils.JwtUtil;
import com.google.protobuf.StringValue;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
public class RouteLoggingFilter implements GlobalFilter, Ordered {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Autowired
    private SecurityServiceClient securityServiceClient;

    @Autowired
    private JwtUtil jwtUtil;

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        // 获取当前匹配的路由ID
        String routeId = exchange.getAttribute("org.springframework.cloud.gateway.support.ServerWebExchangeUtils.GATEWAY_ROUTE_ID_ATTR");

        // 获取目标URI
        Object uriObj = exchange.getAttribute("org.springframework.cloud.gateway.support.ServerWebExchangeUtils.GATEWAY_REQUEST_URL_ATTR");

        System.out.println("===== 路由转发日志 =====");
        System.out.println("请求路径: " + exchange.getRequest().getURI());
//        System.out.println("匹配路由ID: " + routeId);
//        System.out.println("目标URI: " + (uriObj != null ? uriObj.toString() : "未知"));
        System.out.println("=======================");

        ServerHttpRequest request = exchange.getRequest();

        // 获取Authorization头
        String authHeader = request.getHeaders().getFirst("Authorization");
        // 检查Authorization头
        if (!exchange.getRequest().getHeaders().containsKey(HttpHeaders.AUTHORIZATION)) {
//            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Missing authorization header");
            return chain.filter(exchange);
        }
        if (authHeader != null && authHeader.startsWith("Bearer ")) {
            String token = authHeader.substring(7);
            // 验证token
            if (jwtUtil.validateToken(token)) {
                String userDetailJson = jwtUtil.extractUsername(token);
                UserDetailsDto userDetailDto = JSON.parseObject(userDetailJson, UserDetailsDto.class);

                // 将用户信息添加到请求头
                ServerHttpRequest.Builder builder = request.mutate();
                builder.header("userId", userDetailDto.getId().toString());
                builder.header("userName", userDetailDto.getUsername());
                builder.header("realName", userDetailDto.getRealName());
                builder.header("phone", userDetailDto.getPhone());


                // 继续过滤器链
                return chain.filter(exchange.mutate().request(builder.build()).build());
            }
        }
        // 未通过验证，返回401
        exchange.getResponse().setStatusCode(org.springframework.http.HttpStatus.UNAUTHORIZED);
        return exchange.getResponse().setComplete();
    }

    @Override
    public int getOrder() {
        return -100; // 确保在路由匹配后、转发前执行
    }
}