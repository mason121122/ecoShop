package com.ecoShop.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
public class RouteLoggingFilter implements GlobalFilter, Ordered {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        // 获取当前匹配的路由ID
        String routeId = exchange.getAttribute("org.springframework.cloud.gateway.support.ServerWebExchangeUtils.GATEWAY_ROUTE_ID_ATTR");

        // 获取目标URI
        Object uriObj = exchange.getAttribute("org.springframework.cloud.gateway.support.ServerWebExchangeUtils.GATEWAY_REQUEST_URL_ATTR");

        System.out.println("===== 路由转发日志 =====");
        System.out.println("请求路径: " + exchange.getRequest().getURI());
        System.out.println("匹配路由ID: " + routeId);
        System.out.println("目标URI: " + (uriObj != null ? uriObj.toString() : "未知"));
        System.out.println("=======================");

        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return -100; // 确保在路由匹配后、转发前执行
    }
}