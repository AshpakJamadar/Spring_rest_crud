package com.jsp.springrest_crud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/calci")
public class Calcicontroller {

	
	@GetMapping("/add/{a}/{b}")
	public int addition(@PathVariable int a,@PathVariable int b) {
		int c=a+b;
		return c  ;
	}
	
	@GetMapping("/sub/{a}/{b}")
	public Object substraction(@PathVariable int a,@PathVariable int b) {
		return "sub="+(a-b);
	}
	
	@GetMapping("/mul/{a}/{b}")
	public String multiplication(@PathVariable int a,@PathVariable int b ) {
		return "mul="+(a*b);
	}
	@GetMapping("/div/{a}/{b}")
	public String division(@PathVariable double a,@PathVariable int b ) {
		return "div="+(a/b);
	}
}
