package com.jsp.springrest_crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info=@Info(title = "Admin CRUD operation", description = "Rest Api for perfoming crud operation" ,version ="1.0",contact = @Contact(email = "amjamadar2001@gmail.com", name = "ashpak",url = "dcsccds000")))

public class SpringrestCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringrestCrudApplication.class, args);
	}

}
