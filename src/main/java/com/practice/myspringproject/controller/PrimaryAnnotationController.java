package com.practice.myspringproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.myspringproject.interfaces.Coach;

@RestController
public class PrimaryAnnotationController {

	private Coach coach;
	
	public PrimaryAnnotationController(Coach coach) {
		this.coach = coach;
	}
	
	@GetMapping("/getPrimaryWorkout")
	public String getSetterWorkout() {
		return coach.getDailyWorkout();
	}
}
