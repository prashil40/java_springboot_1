package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService  userService;

    @GetMapping(value = "/task")
    public List<User> getAllUsers(){
        return userService.getAll();
    }

    @PostMapping
    public User create(@RequestBody User user){
        return userService.createUser(user);
    }
}
