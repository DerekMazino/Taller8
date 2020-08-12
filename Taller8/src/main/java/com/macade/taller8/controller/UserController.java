	package com.macade.taller8.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	@GetMapping("/registro")
	public String registro() {
		return "registro";
	}
}
