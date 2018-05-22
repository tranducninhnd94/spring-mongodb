package com.example.demo.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "topics")
@Getter
@Setter
public class Topic {

	@Id
	@Field("_id")
	private String id;

	@Field("name")
	private String name;
	
	@Field("create_at")
	private Date createAt;
	
	@Field("image_url")
	private String imageUrl;

	public Topic(String id, String name, Date createAt, String imageUrl) {
		super();
		this.id = id;
		this.name = name;
		this.createAt = createAt;
		this.imageUrl = imageUrl;
	}

	public Topic() {
		super();
		// TODO Auto-generated constructor stub
	}

}
