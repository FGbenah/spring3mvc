package com.franki5.spring3.controller;

import org.springframework.stereotype.Controller;

@Controller
public class HelloWorldController {
	@RequestMapping("/hello")
	public ModelAndView helloWorld(){
		String message ="Hello World, Spring 3.0!";
		return new ModelAndView("hello","message", message);
	}

}
