package com.example.demo.service;

import java.util.List;

import com.example.demo.models.Topic;

public interface TopicService {
	
	List<Topic> findAll();
	
	List<Topic> findByName(String nameTopic);
	
}
