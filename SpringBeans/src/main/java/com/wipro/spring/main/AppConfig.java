package com.wipro.spring.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.wipro.spring.beans.Movie;

@Configuration
@ComponentScan(value="com.wipro.spring")
public class AppConfig {
// No bean definitions are needed here, as the component scan handles it
	
	@Bean(name = "movieObject")
    public Movie movieBean() {
        return new Movie(); // Or retrieve from a source
    }
	
}