package com.wipro.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.spring.beans.Movie;

public class Client {
public static void main(String[] args) {

System.out.println("Hello World!");

// Create an ApplicationContext to load the AppConfig class

ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");


Movie movie = (Movie) context.getBean("movieObject");

System.out.println(movie.toString());
}
}