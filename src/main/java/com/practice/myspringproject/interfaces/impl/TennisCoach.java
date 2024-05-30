package com.practice.myspringproject.interfaces.impl;

import org.springframework.stereotype.Component;

import com.practice.myspringproject.interfaces.Coach;

@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice Tennis for 15mins daily";
	}

}
