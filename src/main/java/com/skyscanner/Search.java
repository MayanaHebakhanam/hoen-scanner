package com.skyscanner;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Search {
	
	@JsonProperty
	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Search() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
