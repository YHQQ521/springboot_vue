package com.blog.yhqq.controller;

import com.blog.yhqq.repository.PersonRepository;
import com.blog.yhqq.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MongodbController {
    @Autowired
    PersonRepository personRepository;
    @RequestMapping("/save")
    public Person save(){
        Person p = new Person("马登伟3333",30);
        return personRepository.save(p);
    }

}
