package com.ecoShop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

@Configuration
public class CorsConfig {

    @Bean
    public CorsWebFilter corsWebFilter() {
        CorsConfiguration corsConfig = new CorsConfiguration();
        corsConfig.addAllowedOriginPattern("*"); // 注意：生产环境应使用具体域名
        corsConfig.addAllowedHeader("*");
        corsConfig.addAllowedMethod("*");
        corsConfig.setAllowCredentials(true);

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", corsConfig);
//        registry.addMapping("/**")
//                .allowedOrigins("http://localhost:3000") // 仅允许该域名的跨域请求
//                .allowedMethods("GET", "POST", "PUT", "DELETE") // 允许的HTTP方法
//                .allowedHeaders("*") // 允许的请求头
//                .allowCredentials(true) // 是否允许携带凭证
//                .maxAge(3600); // 预检请求的缓存时间（秒）

        return new CorsWebFilter(source);
    }
}