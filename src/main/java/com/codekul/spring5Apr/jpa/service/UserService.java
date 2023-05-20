package com.codekul.spring5Apr.jpa.service;

import com.codekul.spring5Apr.jpa.entity.User;

public interface UserService {
    void saveUser(User user);
    String login(String username,String password);
}
