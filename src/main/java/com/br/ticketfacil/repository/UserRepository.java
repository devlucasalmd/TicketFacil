package com.br.ticketfacil.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.ticketfacil.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
