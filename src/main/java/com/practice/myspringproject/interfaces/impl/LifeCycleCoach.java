package com.practice.myspringproject.interfaces.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.practice.myspringproject.interfaces.Coach;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Primary
public class LifeCycleCoach implements Coach {

	@PostConstruct
	public void printAtStart() {
		System.out.println("Before object creation");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Exploring spring bean life cycle";
	}
	
	@PreDestroy
	public void printAtEnd() {
		System.out.println("Before object creation");
	}
}
