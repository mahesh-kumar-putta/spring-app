package com.practice.myspringproject.interfaces.impl;

import org.springframework.stereotype.Component;

import com.practice.myspringproject.interfaces.Coach;

@Component
public class BaseBallCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice Base Ball for 15mins daily";
	}

}
