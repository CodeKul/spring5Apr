package com.codekul.spring5Apr.jpa.controller;

import com.codekul.spring5Apr.jpa.entity.User;
import com.codekul.spring5Apr.jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<?> saveUser(@RequestBody User user){
        userService.saveUser(user);
        return ResponseEntity.ok("saved");
    }
    @GetMapping
    public ResponseEntity<?> login(@RequestParam String username,
                                   @RequestParam String password){
        System.out.println("in login service");
        return ResponseEntity.ok(  userService.login(username, password));
    }
}
