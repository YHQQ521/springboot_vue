package com.blog.yhqq.repository;

import com.blog.yhqq.domain.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person, String>{
    Person findByName(String name);
}
