package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class Controller {
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/employees")
	public Iterable<Employee> getEmployees(){
		return employeeService.getEmployees();
		
	}
	

}
