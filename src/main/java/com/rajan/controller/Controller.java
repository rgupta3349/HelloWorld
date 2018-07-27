package com.rajan.controller;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class Controller {
	
	@GetMapping(path="/helloworld" )
	public String helloWorld()
	{
		
		return "Hello Rajan!!";
	}
	


}
