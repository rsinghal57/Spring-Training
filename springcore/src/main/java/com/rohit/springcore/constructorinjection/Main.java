package com.rohit.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("configCI.xml");
		Person p1 = (Person) context.getBean("person");
		System.out.println(p1.toString());
		// TODO Auto-generated method stub

	}

}
