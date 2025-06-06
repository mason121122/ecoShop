package com.ecoshop;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ecoshop.dao.mapper") //扫描的mapper
@Slf4j
public class WebApplication{

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
}
