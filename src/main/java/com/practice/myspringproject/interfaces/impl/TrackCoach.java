package com.practice.myspringproject.interfaces.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.practice.myspringproject.interfaces.Coach;

@Component
//@Primary
public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run for 30mins everyday";
	}

}
