package com.example.demo.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Audio {
	
	private String audio_url;
	
	private String audio_type;

	public Audio(String audio_url, String audio_type) {
		super();
		this.audio_url = audio_url;
		this.audio_type = audio_type;
	}

	public Audio() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
