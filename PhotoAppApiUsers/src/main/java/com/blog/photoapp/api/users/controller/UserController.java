package com.blog.photoapp.api.users.controller;

import com.blog.photoapp.api.users.entity.User;
import com.blog.photoapp.api.users.model.UserRequest;
import com.blog.photoapp.api.users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/status/check")
    public String status() {
        return "working!";
    }

    @PostMapping("/create")
    public User createUser(@RequestBody @Valid UserRequest userRequest) {
        return userService.createUser(userRequest);
    }
}
