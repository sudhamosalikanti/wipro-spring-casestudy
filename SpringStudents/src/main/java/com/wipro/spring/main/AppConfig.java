package com.wipro.spring.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.wipro.spring.beans.Student;


@Configuration
@ComponentScan(value="com.wipro.spring.beans")
public class AppConfig {
// No bean definitions are needed here, as the component scan handles it
	
	@Bean(name = "student1")
    public Student student1() {
        return new Student(); // Or retrieve from a source
    }
	
	@Bean(name = "student2")
    public Student student2() {
        return new Student(); // Or retrieve from a source
    }
}