package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {
	

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
		return args ->{
			Student s1=new Student("Rohit", "Singhal", "rsinghal57@gmail.com", 22);
			studentRepository.save(s1);
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
	}

}
