package com.bhandari.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	@GetMapping("/msg")
	public String getMSg() {
		return " Welcome to Rest Api...";

	}

}
