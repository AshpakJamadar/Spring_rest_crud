package com.jsp.springrest_crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainContoller {

	@GetMapping("/")
	public String loadSwagger() {
		return "redirect:/swagger-ui/index.html";
	}
	
	
}
