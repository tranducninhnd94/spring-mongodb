package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Topic;
import com.example.demo.repository.TopicRepository;
import com.example.demo.repository.predicate.TopicPredicate;

@Service
public class TopicServiceImpl implements TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	@Override
	public List<Topic> findAll() {
		// TODO Auto-generated method stub
		
		return topicRepository.findAll();
	}

	@Override
	public List<Topic> findByName(String nameTopic) {
		// TODO Auto-generated method stub
		return (List<Topic>) topicRepository.findAll(TopicPredicate.findAll(nameTopic));
	}
}
