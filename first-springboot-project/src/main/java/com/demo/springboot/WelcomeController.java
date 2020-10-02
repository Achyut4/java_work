package com.demo.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	//Auto Wiring
	@Autowired
	private WelcomeService service;
	@RequestMapping("/welcome")
	public String welcome() {
		
		return service.retrieveWlcomeMessage();
	}
}

// Spring to Manage this bean and Create an Instance of this
@Component
class WelcomeService{
	
	protected String retrieveWlcomeMessage() {
		
		//Complex Method
		return "Good Morning Updated"; 
	}
}
