package com.practice.myspringproject.interfaces.impl;

import org.springframework.stereotype.Component;

import com.practice.myspringproject.interfaces.Coach;

@Component
public class CricketCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Practice Batting for 15mins daily";
	}

}
