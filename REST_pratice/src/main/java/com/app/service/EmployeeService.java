package com.app.service;

import java.util.List;

import com.app.entities.Employee;

public interface EmployeeService {
	
	List<Employee> getDetails();

	Employee addEmp(Employee emp);

}
