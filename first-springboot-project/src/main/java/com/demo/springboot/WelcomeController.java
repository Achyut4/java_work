package com.demo.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	private WelcomeService  service = new WelcomeService();
	@RequestMapping("/welcome")
	public String welcome() {
		
		return service.retrieveWlcomeMessage();
	}
	

}

class WelcomeService{
	
	protected String retrieveWlcomeMessage() {
		
		//Complex Method
		return "Good Morning"; 
	}
}
