package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.service.ProductService;

public class UserController {

	@Autowired
	private ProductService service;
	
	public void getString() {
		System.out.println("in string");
	}
	
	public void getInt() {
		System.out.println("in int");
	}
}

