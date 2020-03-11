package com.blog.yhqq.controller;

import org.apache.ibatis.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MysqlController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping(value="/hello", method= RequestMethod.GET)
    public String index() {

        String sql = "SELECT name FROM table1 WHERE id = ?";

        // 通过jdbcTemplate查询数据库
        String name = (String)jdbcTemplate.queryForObject(
                sql, new Object[] { 1 }, String.class);

        return "Hello " + name;
    }
}


