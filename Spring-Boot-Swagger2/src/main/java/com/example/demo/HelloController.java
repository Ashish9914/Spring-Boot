package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/api/rpa")
	public String sayHello() {
		return "Swagger Hello World";
	}
	@RequestMapping(method = RequestMethod.GET, value = "/api/rpa2")
	public String sayHello2() {
		return "Swagger Hello World";
	}
	
}