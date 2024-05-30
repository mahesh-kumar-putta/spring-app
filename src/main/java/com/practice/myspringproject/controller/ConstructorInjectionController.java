package com.practice.myspringproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.myspringproject.interfaces.Coach;

@RestController
public class ConstructorInjectionController {

	private Coach coach;
	
	@Autowired
	public ConstructorInjectionController(@Qualifier("cricketCoach") Coach coach) {
		this.coach=coach;
	}
	
	@GetMapping("/getWorkout")
	public String getWorkoutDetails() {
		return coach.getDailyWorkout();
	}
}
