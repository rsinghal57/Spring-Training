package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeRepository employeeRepository;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}


	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}


	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}


	@Override
	public Employee getEmployeeById(long id) {
		
//		  Optional<Employee> emp=employeeRepository.findById(id);
//		  if(emp.isPresent())
//		  {
//			  return emp.get();
//		  }
//		  else
//		  {
//			  throw new ResourceNotFoundException("Employee","ID", String.valueOf(id));
//		  }
		  return employeeRepository.findById(id).orElseThrow(()-> 
		  new ResourceNotFoundException("Employee", "ID",String.valueOf(id)));
	}


	@Override
	public Employee updateEmployee(Employee employee, long id) {
		Employee existingEmployee=employeeRepository.findById(id).orElseThrow(()->
		new ResourceNotFoundException("Employee", "ID",String.valueOf(id)));
		
		existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setLastName(employee.getLastName());
		existingEmployee.setEmail(employee.getEmail());
		
		employeeRepository.save(existingEmployee);
		return existingEmployee;
		
	}


	@Override
	public void deleteEmployee(long id) {
		employeeRepository.findById(id).orElseThrow(()-> 
		  new ResourceNotFoundException("Employee", "ID",String.valueOf(id)));
		
      employeeRepository.deleteById(id);		
	}

}
