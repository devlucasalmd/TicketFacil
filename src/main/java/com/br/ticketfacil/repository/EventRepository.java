package com.br.ticketfacil.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.ticketfacil.model.Event;

public interface EventRepository extends JpaRepository<Event, Long>{

}
