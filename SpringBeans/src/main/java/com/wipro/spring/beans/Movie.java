package com.wipro.spring.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.context.annotation.*;

public class Movie {
	private String movield;
	private String movieName;
	private String movieActor;

	// Getters and Setters
	public String getMovield() {
	return movield;
	}

	public void setMovield(String movield) {
	this.movield = movield;
	}

	public String getMovieName() {
	return movieName;
	}

	public void setMovieName(String movieName) {
	this.movieName = movieName;
	}

	public String getMovieActor() {
	return movieActor;
	}

	public void setMovieActor(String movieActor) {
	this.movieActor = movieActor;
	}

	@Override
	public String toString() {
	return "Movie Details:" +
	"\n- Movie ID: " + movield +
	"\n- Movie Name: " + movieName +
	"\n- Movie Actor: " + movieActor;
	}
	}


