package com.ecoshop.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Vance
 * @date 2021/10/3
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {
    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo()).enable(true)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.ecoshop.web.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("", "url", "");
        return new ApiInfoBuilder()
                .title("ecoshop系统Restful API")
                .description("ecoshop系统Restful API")
                .termsOfServiceUrl("")
                .contact(contact)
                .version("1.0-SNAPSHOT")
                .build();
    }
}
