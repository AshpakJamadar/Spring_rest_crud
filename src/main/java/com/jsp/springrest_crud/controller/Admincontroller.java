package com.jsp.springrest_crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.springrest_crud.dto.Admin;
import com.jsp.springrest_crud.service.Adminservice;


@RestController
@RequestMapping("/admins")
public class Admincontroller {

	@Autowired
	Adminservice service;
	 
	@PostMapping
	public ResponseEntity<String> save(@RequestBody Admin admin) {	
		return  service.saveAdmin(admin);
	}
	
	@PostMapping("/many")
	public ResponseEntity<List<Admin>> saveAll(@RequestBody List<Admin> admins) {
		return service.saveAllAdmins(admins);
	}
	
	@GetMapping
	public ResponseEntity<List<Admin>> fetch() {
		return service.fetch();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Admin> fetchId(@PathVariable int id){
		return service.fetchById(id);
	}
	
	@GetMapping("/email/{email}")
	public ResponseEntity<List<Admin>>  fetchEmail(@PathVariable String email){
		return service.fetchByEmail(email);
	}
	
	@GetMapping("/login/{email}/{password}")
	public ResponseEntity<List<Admin>> fetchLogin(@PathVariable String email,@PathVariable String password){
		return service.fetchByEmailAndPass(email,password);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteId(@PathVariable int id){
		return service.deleteById(id);
	}
	

	@PutMapping
	public ResponseEntity<String> update(@RequestBody Admin admin) {	
		return  service.saveAdmin(admin);
	}
	
	
	
}
