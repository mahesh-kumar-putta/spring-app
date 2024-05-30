package com.practice.myspringproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.myspringproject.interfaces.Coach;

@RestController
public class SetterInjectionController {

	private Coach coach;
	
	@Autowired
	public void setCoach(@Qualifier("tennisCoach") Coach coach) {
		this.coach=coach;
	}
	
	@GetMapping("/getSetterWorkout")
	public String getSetterWorkout() {
		return coach.getDailyWorkout();
	}
}
