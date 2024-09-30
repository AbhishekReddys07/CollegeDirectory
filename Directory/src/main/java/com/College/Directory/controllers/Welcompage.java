package com.College.Directory.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Welcompage {

	@GetMapping("/")
	public String welcompage() {
		return "welcomPage";
	}
	
	
}
