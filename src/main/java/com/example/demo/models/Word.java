package com.example.demo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "words")
@Getter
@Setter
public class Word {
	
	@Id
	@Field("_id")
	private String id;
	
	@Field("name")
	private String name;
	
	@Field("topic")
	private String topicId;
	
	@Field("example")
	private Example example;
	
	@Field("vacabulay")
	private String vocabulary;
	
	@Field("explanation")
	private String explanation;
	
	@Field("pronunciation")
	private String pronunciation;
	
	@Field("audio")
	private Audio audio;
	
	@Field("image_url")
	private String imageUrl;

	public Word(String id, String name, String topic, Example example, String vocabulary, String explanation,
			String pronunciation, Audio audio, String imageUrl) {
		super();
		this.id = id;
		this.name = name;
		this.topicId = topic;
		this.example = example;
		this.vocabulary = vocabulary;
		this.explanation = explanation;
		this.pronunciation = pronunciation;
		this.audio = audio;
		this.imageUrl = imageUrl;
	}

	public Word() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
