package com.feng.customer.controller;

import com.feng.model.User;
import com.feng.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class TestController {

    @Reference
    private UserService userService;

    @RequestMapping("/findAll")
    public List<User> findAll(){
        return userService.findAll();
    }

    @RequestMapping("sayHello")
    public String sayHello(String name){
        return userService.sayHello(name);
    }

    @RequestMapping("hello/{name}")
    public String hello(@PathVariable String name){
        return "hello"+name;
    }
}
