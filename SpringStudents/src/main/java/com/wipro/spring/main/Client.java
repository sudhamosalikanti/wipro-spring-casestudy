package com.wipro.spring.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro.spring.beans.*;


public class Client {
public static void main(String[] args) {

	// Load the Spring configuration from AppConfig.java
	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

	// Retrieve the first student bean
	Student student1 = context.getBean("student1", Student.class);
	System.out.println("Details of the first student:");
	
	Test test1= new Test();
	test1.setTestid("test1");
	test1.setTestMarks(100);
	test1.setTestTitle("Maths");
	
	student1.setStudentId("123");
	student1.setStudentName("Ram");
	student1.setStudentTests(List.of(test1));
	System.out.println(student1);

	// Retrieve the second student bean
	Student student2 = context.getBean("student2", Student.class);
	System.out.println("\nDetails of the second student:");
	
	student2.setStudentId("134");
	student2.setStudentName("Lakshman");
	student2.setStudentTests(List.of(test1));
	System.out.println(student2);
	
}
}