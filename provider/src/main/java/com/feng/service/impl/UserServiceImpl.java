package com.feng.service.impl;


import com.feng.model.User;
import com.feng.service.UserService;
import org.apache.dubbo.config.annotation.Service;

import java.util.LinkedList;
import java.util.List;

//@Service(version = "1.0.0", interfaceClass = UserService.class)
@Service()
public class UserServiceImpl implements UserService {


    @Override
    public List<User> findAll() {

        LinkedList users = new LinkedList();
        User user = new User(1, "小明", "男", "20");
        User user1 = new User(2, "小紅", "女", "22");
        users.add(user);
        users.add(user1);
        return users;
    }

    @Override
    public String sayHello(String name) {
        return "hello,"+name;
    }
}
