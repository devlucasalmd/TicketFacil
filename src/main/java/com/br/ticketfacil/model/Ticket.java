package com.br.ticketfacil.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;

@Entity
public class Ticket {

	private Long id;
//	private Long eventId;
//	private User user; 
	private LocalDateTime purchaseDate;
	private String codeTicket;
}
