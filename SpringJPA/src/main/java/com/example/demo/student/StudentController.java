package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;
import com.example.demo.student.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//@RestController
//@RequestMapping(path = "api/v1/student")
public class StudentController {
	
	private final StudentService studentService;
	
	@Autowired
	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}


//	@GetMapping
	public List<Student> getStudents()
	{
		return studentService.getStudents();
	}

}
