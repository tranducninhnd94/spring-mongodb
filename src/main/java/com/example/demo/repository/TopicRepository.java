package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Topic;

@Repository
public interface TopicRepository extends MongoRepository<Topic, String>, QuerydslPredicateExecutor<Topic>{

}
