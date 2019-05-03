package com.mahesh.mainapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mahesh.model.Employee;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/mahesh/resources/spring.xml");
		
		Employee employee=(Employee)context.getBean("emp");
		System.out.println(employee);
	}
}
