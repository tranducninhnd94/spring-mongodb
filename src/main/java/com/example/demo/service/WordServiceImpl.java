package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Word;
import com.example.demo.repository.WordRepository;

@Service
public class WordServiceImpl implements WordService{
	
	@Autowired
	private WordRepository wordRepository;
	
	@Override
	public List<Word> findAll(){
		return wordRepository.findAll();
	}
}
