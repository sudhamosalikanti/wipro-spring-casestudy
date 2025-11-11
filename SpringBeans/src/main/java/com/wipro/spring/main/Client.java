package com.wipro.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro.spring.beans.Movie;

public class Client {
public static void main(String[] args) {

System.out.println("Hello World!");

// Create an ApplicationContext to load the AppConfig class
ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


Movie movie = (Movie) context.getBean("movieObject");

movie.setMovieActor("Ram");
movie.setMovieName("Ramayan");
movie.setMovield("123");

System.out.println(movie.toString());
}
}