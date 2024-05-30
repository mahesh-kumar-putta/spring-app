package com.practice.myspringproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.myspringproject.interfaces.Coach;

@RestController
public class LifeCycleController {

	private Coach coach;
	
	@Autowired
	public LifeCycleController(Coach coach){
		this.coach=coach;
	}
	
	@GetMapping("/getLifeCycle")
	public String getLifecycle() {		
		return coach.getDailyWorkout();
	}
}
