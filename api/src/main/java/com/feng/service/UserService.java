package com.feng.service;

import com.feng.model.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    String sayHello(String name);
}
