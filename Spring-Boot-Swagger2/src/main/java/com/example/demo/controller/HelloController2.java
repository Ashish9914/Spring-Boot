package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController2 {
	
	@RequestMapping(method = RequestMethod.GET, value = "/api/rpa3")
	public String sayHello3() {
		return "Swagger Hello World";
	}

}
