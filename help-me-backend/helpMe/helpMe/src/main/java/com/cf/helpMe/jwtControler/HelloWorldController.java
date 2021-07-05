package com.cf.helpMe.jwtControler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping({"/hello"})
	public String firstPage(){
		return "Hello World";
	}
}
