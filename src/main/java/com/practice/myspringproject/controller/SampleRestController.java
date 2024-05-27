package com.practice.myspringproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {

	@GetMapping("/")
	public String printMessage() {
		return "<h1>Hello World!!</h1>";
	}
}
