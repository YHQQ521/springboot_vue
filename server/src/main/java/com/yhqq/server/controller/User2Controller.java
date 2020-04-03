package com.yhqq.server.controller;

import com.yhqq.server.bean.User2;
import com.yhqq.server.service.User2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public class User2Controller {
    @Autowired
    User2Service user2Service;
    @RequestMapping("/alluser")
    public List<User2> getAllUser() {
        return user2Service.getAlluser();
    }
}
