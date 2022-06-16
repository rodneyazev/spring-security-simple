package com.spring.app.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpringSecurityController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/home")
	public String home(){
		return "home";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}

}
