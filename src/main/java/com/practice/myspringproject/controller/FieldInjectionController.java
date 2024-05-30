package com.practice.myspringproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.myspringproject.interfaces.Coach;

@RestController
public class FieldInjectionController {

	@Autowired
	@Qualifier("baseBallCoach")
	private Coach coach;
	
	@GetMapping("/getFieldWorkout")
	public String getSetterWorkout() {
		return coach.getDailyWorkout();
	}
}
