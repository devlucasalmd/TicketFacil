package com.br.ticketfacil.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;

@Entity
public class Event {
		
	private Long id;
	private String name;
	private LocalDate date;
	private Float price;
	private Integer capacity;
	private String location;
	private String description;
	
	
}
