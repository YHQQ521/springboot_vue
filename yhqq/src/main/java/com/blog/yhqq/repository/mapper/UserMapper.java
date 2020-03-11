package com.blog.yhqq.repository.mapper;

import com.blog.yhqq.domain.User;

import java.util.List;

public interface UserMapper {
    List<User> queryAllUsers();
}