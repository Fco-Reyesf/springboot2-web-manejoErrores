package com.proyecto.springboot.error.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppControler {

	@SuppressWarnings("unused")
	@GetMapping("/index")
	public String index(){
		int numero = 1000/0;
		return "index";
	}
	
}
