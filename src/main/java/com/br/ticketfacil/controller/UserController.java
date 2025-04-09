package com.br.ticketfacil.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.ticketfacil.repository.UserRepository;
import com.br.ticketfacil.model.User;

@RestController
@RequestMapping("/user")

public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping
	public List<User> readAllUser(){
		return userRepository.findAll();
	}
}
