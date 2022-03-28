package com.example.demo;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("/student")
	public Student getStudent()
	{
		return new Student("Rohit", "Singhal", 35);
	}
	
	@GetMapping("/students")
	public List<Student> getStudents()
	{
		return List.of(new Student("Harish","Kumar",33),new Student("Rohit", "Singhal", 35),new Student("Shilajit", "Das", 32));	
	}
	
	@GetMapping("/student/{firstName}/{lastName}")
	public Student studentPathvariable(@PathVariable("firstName") String firstName, 
			@PathVariable("lastName") String lastName)
	{
		return new Student(firstName,lastName,10);
	}
	
	
	@GetMapping("/student/query")
	public Student studentQueryParam(
			@RequestParam(name = "firstName") String firstName,
			@RequestParam(name = "lastName") String lastName)
	{
		return new Student(firstName,lastName,50);
	}
	
	
}
