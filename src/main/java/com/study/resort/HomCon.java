package com.study.resort;

import org.springframework.web.bind.annotation.GetMapping;

public class HomCon {
	
	@GetMapping("/")
	public String home() {
		return "/home";
	}

}
