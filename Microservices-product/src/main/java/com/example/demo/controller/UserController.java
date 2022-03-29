package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.example.demo.service.ProductService;

public class UserController {
RestTemplate rest;
	@Autowired
	private ProductService service;
	
	public void getString() {
		System.out.println("in string");
	}
	
	public void getInt() {
		System.out.println("in int");
	}
}

