package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	public List<Student> getStudents()
	{
		Student s1=new Student(3535,"Rohit","rsinghal57@gmail.com",22,LocalDate.of(1999,8,11));
		return List.of(s1);
	}

}
