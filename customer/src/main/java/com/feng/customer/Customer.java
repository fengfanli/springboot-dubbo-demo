package com.feng.customer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo(scanBasePackages = "com")
public class Customer {

    public static void main(String[] args) {
        SpringApplication.run(Customer.class, args);
    }
}
