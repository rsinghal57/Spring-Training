package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeService {
	
	public Employee saveEmployee(Employee employee);
	
	public List<Employee> getAllEmployees();
	
	public Employee getEmployeeById(long id);
	
	public Employee updateEmployee(Employee employee, long id);
	
	public void deleteEmployee(long id);

}
