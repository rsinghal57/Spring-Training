package com.rohit.springcore.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("configAutowire.xml");
		Employee e1 = (Employee) context.getBean("emp");
		System.out.println(e1);
		// TODO Auto-generated method stub

	}

}
