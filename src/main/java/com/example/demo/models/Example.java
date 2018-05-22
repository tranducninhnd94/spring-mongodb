package com.example.demo.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Example {
	private String vi;
	
	private String en;

	public Example(String vi, String en) {
		super();
		this.vi = vi;
		this.en = en;
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
