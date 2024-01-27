package com.bhandari.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

	@GetMapping("/welcome")
	public String getMessage() {
		
		int a= 10/0;
		return "Welcome to Rest API";
	}
}
