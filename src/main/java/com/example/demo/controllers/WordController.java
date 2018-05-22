package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Word;
import com.example.demo.service.WordService;

@RestController
public class WordController {

	@Autowired
	private WordService wordService;
	
	@RequestMapping(value = "/word", method = RequestMethod.GET)
	public ResponseEntity<List<Word>> findAll(){
		
		List<Word> rs = wordService.findAll();
		
		
		return new ResponseEntity<List<Word>>(rs, HttpStatus.OK);
	}
	
}
