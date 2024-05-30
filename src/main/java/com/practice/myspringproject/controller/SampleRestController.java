package com.practice.myspringproject.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {
	
	
	@Value("${test.prop1}")
	private String value1;
	
	
	@Value("${test.prop2}")
	private String value2;

	@GetMapping("/hello")
	public String printMessage() {
		System.out.println(value1+" "+value2);
		return "<h1>Hello World!!</h1>";
	}
}
