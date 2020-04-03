package com.yhqq.server.service;

import com.yhqq.server.bean.User2;
import com.yhqq.server.mapper.User2Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class User2Service {
    @Autowired
    User2Mapper user2Mapper;
    public List<User2> getAlluser() {
        List<User2> list = user2Mapper.allUser();
        return list;
    }
}
