package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Employee;
import com.app.service.EmployeeService;

@RestController
@CrossOrigin
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	public EmployeeController() {
		System.out.println("in employee controller " + getClass());
	}
	
	@GetMapping
	public List<Employee> getAllDetails(){
		return empService.getDetails();
	}
	
	@PostMapping("/add")
	public Employee addNewEmp(@RequestBody Employee emp){
		return empService.addEmp(emp);
	}
	

}
