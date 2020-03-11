package com.blog.yhqq.controller;

import com.blog.yhqq.domain.User;
import com.blog.yhqq.service.UserService;
import com.blog.yhqq.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/web")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/queryAllUsers")
    public List<User> queryAllUsers(){
        return userService.queryAllUsers();
    }
}