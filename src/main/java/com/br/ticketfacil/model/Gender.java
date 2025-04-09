package com.br.ticketfacil.model;

import lombok.Getter;

@Getter
public enum Gender {

	MALE("male"),
	FEMALE("female"),
	OTHER("other");
	
	private String description;

	Gender(String description) {
		// TODO Auto-generated constructor stub
		this.description = description;
	}
	
	
}
