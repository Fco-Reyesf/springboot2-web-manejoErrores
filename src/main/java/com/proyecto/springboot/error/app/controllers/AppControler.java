package com.proyecto.springboot.error.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppControler {

	@GetMapping("/index")
	public String index(){
		return "index";
	}
	
}
