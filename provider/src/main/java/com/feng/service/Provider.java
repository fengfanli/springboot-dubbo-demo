package com.feng.service;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo(scanBasePackages = "com")
public class Provider {

    public static void main(String[] args) {
        SpringApplication.run(Provider.class, args);
    }
}
