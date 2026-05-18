package com.cjc.springbootapp.controller;

import com.cjc.springbootapp.SpringbootappApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

   

	@GetMapping("/hello")
	public String hello() {
		return "welcome to springboot";
	}
	
	@GetMapping("/welcome")
	public String m1() {
		return "welcome to CICD";
	}
	
	
}
