package com.demo.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@RequestMapping("/welcome")
	public String welcome() {
		
		return "This is Welcome Screen";
	}
	

}
