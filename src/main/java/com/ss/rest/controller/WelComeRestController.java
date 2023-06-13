package com.ss.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelComeRestController {
	
	public WelComeRestController() {
		System.out.println("****************WelcomeRestController************************");
	}

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to SpringBootApp";
	}
	
	@GetMapping("/greet")
	public String greet() {
		return "Greeting !!! from Infinite";
	}
}
