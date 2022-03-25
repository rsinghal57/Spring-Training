package com.rohit.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("configStereotype.xml");
		Student s1 = (Student) context.getBean("student");
		System.out.println(s1);
		// TODO Auto-generated method stub

	}

}
