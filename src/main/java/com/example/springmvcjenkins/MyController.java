package com.example.springmvcjenkins;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@RequestMapping("/hello")
	public String hello() {
		xxxx;
		return "Hello World 2021......";
	}
}
