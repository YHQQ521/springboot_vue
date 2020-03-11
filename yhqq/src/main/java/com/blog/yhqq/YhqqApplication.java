package com.blog.yhqq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Controller;


@SpringBootApplication
@Configuration
@EnableMongoRepositories
@Controller
@MapperScan("com.blog.yhqq.repository.mapper")
public class YhqqApplication {

    public static void main(String[] args) {
        SpringApplication.run(YhqqApplication.class, args);
    }

}
