package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.models.Word;

public interface WordRepository extends MongoRepository<Word, String>{
	
}
