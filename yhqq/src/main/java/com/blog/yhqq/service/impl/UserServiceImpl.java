package com.blog.yhqq.service.impl;

import com.blog.yhqq.domain.User;
import com.blog.yhqq.repository.mapper.UserMapper;
import com.blog.yhqq.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Slf4j
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryAllUsers() {
//        log.info("/queryAllUsers start...");
        return userMapper.queryAllUsers();
    }
}