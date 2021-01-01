package com.example.springmvcjenkins;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello world 2021..";
	}
}
