package com.ecoshop.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * @author Vance
 * @date 2021/10/3
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {
//    @Bean
//    public Docket docket(){
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo()).enable(true)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.ecoshop.web.controller"))
//                .paths(PathSelectors.any())
//                .build();
//    }
//    private ApiInfo apiInfo() {
//        Contact contact = new Contact("", "url", "");
//        return new ApiInfoBuilder()
//                .title("ecoshop系统Restful API")
//                .description("ecoshop系统Restful API")
//                .termsOfServiceUrl("")
//                .contact(contact)
//                .version("1.0-SNAPSHOT")
//                .build();
//    }




    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                // 扫描接口所在包路径
                .apis(RequestHandlerSelectors.basePackage("com.ecoshop.web.controller"))
                .paths(PathSelectors.any())
                .build()
                // 添加全局Token参数
                .securitySchemes(securitySchemes())
                .securityContexts(securityContexts());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("API文档")
                .description("接口文档")
                .version("1.0")
                .build();
    }

    // 设置Token认证方式（ApiKey）
    private List<ApiKey> securitySchemes() {
        List<ApiKey> apiKeyList = new ArrayList<>();
        // 参数名称一般为"Authorization"或"token"，根据实际认证方式调整
        apiKeyList.add(new ApiKey("Authorization", "Authorization", "header"));
        return apiKeyList;
    }

    // 配置安全上下文，使Token生效
    private List<SecurityContext> securityContexts() {
        List<SecurityContext> securityContexts = new ArrayList<>();
        securityContexts.add(
                SecurityContext.builder()
                        .securityReferences(defaultAuth())
                        // 匹配需要认证的路径，这里设置为所有路径
                        .forPaths(PathSelectors.any())
                        .build()
        );
        return securityContexts;
    }

    // 设置授权范围
    private List<SecurityReference> defaultAuth() {
        AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
        authorizationScopes[0] = authorizationScope;
        List<SecurityReference> securityReferences = new ArrayList<>();
        securityReferences.add(new SecurityReference("Authorization", authorizationScopes));
        return securityReferences;
    }
}
