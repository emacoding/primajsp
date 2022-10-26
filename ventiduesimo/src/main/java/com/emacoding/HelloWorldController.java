package com.emacoding;
 
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class HelloWorldController {
 
	
	
	private String message = "Primo messaggio!"; 
	@RequestMapping("/")
	public String welcome(Map < String, Object > model) {
	model.put("message", this.message);
	return "helloWorld";
	
	
	
	
    }
    
		
}