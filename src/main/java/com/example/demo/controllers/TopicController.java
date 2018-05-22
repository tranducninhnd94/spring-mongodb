package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Topic;
import com.example.demo.service.TopicService;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping(value = "/topic", method = RequestMethod.GET)
	public ResponseEntity<List<Topic>> findAllTopic(){
		List<Topic> result = topicService.findAll();
		
		return new ResponseEntity<List<Topic>>(result, HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/topic/find", method = RequestMethod.GET)
	public ResponseEntity<List<Topic>> findByName(@RequestParam("nameTopic") String nameTopic){
		List<Topic> result = topicService.findByName(nameTopic);
		
		return new ResponseEntity<List<Topic>>(result, HttpStatus.OK);
	}
}
