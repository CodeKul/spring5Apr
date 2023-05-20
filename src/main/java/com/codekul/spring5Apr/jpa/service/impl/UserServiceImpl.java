package com.codekul.spring5Apr.jpa.service.impl;

import com.codekul.spring5Apr.jpa.entity.User;
import com.codekul.spring5Apr.jpa.repository.UserActivityRepository;
import com.codekul.spring5Apr.jpa.repository.UserRepository;
import com.codekul.spring5Apr.jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserActivityRepository userActivityRepository;

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public String login(String username, String password) {
        if (userRepository.existsByUsernameAndPassword(username,password)) {
            return "You are successfully login";
        }else {
            return "Invalid Credentials";
        }
    }
}
