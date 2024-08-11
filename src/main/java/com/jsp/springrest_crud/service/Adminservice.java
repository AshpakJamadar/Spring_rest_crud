package com.jsp.springrest_crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.jsp.springrest_crud.dto.Admin;
import com.jsp.springrest_crud.exception.DataNotFoundException;
import com.jsp.springrest_crud.repository.Adminrepository;

@Component
public class Adminservice {

	@Autowired
	Adminrepository repository;
	
	public ResponseEntity<String> saveAdmin(Admin admin) {
		// TODO Auto-generated method stub
		repository.save(admin);
		return new ResponseEntity<String>("single data inserted sussfully",HttpStatus.CREATED);
	}

	public ResponseEntity<List<Admin>> saveAllAdmins(List<Admin> admins) {
		// TODO Auto-generated method stub
		repository.saveAll(admins);
		return new ResponseEntity<List<Admin>>(admins,HttpStatus.CREATED);
	}

	public ResponseEntity<List<Admin>> fetch(){
		List<Admin> admins=repository.findAll();
		if(admins.isEmpty()) {
//			return new ResponseEntity<List<Admin>>(admins,HttpStatus.NOT_FOUND);
			throw new DataNotFoundException();
		}
		else {
			return new ResponseEntity<List<Admin>>(admins,HttpStatus.FOUND);
		}
	}

	public ResponseEntity<Admin> fetchById(int id) {
		// TODO Auto-generated method stub
		Admin admin=repository.findById(id).orElseThrow(()->new DataNotFoundException("data not found"+id));
//		if(admin==null) {
//			return new ResponseEntity<Admin>(admin,HttpStatus.NOT_FOUND);
//			throw new DataNotFoundException();
//		}else {
			return new ResponseEntity<Admin>(admin,HttpStatus.FOUND);
//		}
	}
	
	public ResponseEntity<List<Admin>> fetchByEmail(String email) {
		// TODO Auto-generated method stub
		List<Admin> admins=repository.findByEmail(email);
		if(admins.isEmpty()) {
//			return new ResponseEntity<List<Admin>>(admins,HttpStatus.NOT_FOUND);
			throw new DataNotFoundException("data not found on this : "+email);

		}else {
			return new ResponseEntity<List<Admin>>(admins,HttpStatus.FOUND);
		}
	}

	public ResponseEntity<List<Admin>> fetchByEmailAndPass(String email, String password) {
		// TODO Auto-generated method stub
		List<Admin> admins=repository.findByEmailAndPassword(email,password);
		if(admins.isEmpty()) {
//			return new ResponseEntity<List<Admin>>(admins,HttpStatus.NOT_FOUND);
			throw new DataNotFoundException("data not found on this given credentials email and login");

		}else {
			return new ResponseEntity<List<Admin>>(admins,HttpStatus.FOUND);
		}
	}

	public ResponseEntity<String> deleteById(int id) {
		// TODO Auto-generated method stub
		Admin admin=repository.findById(id).orElseThrow(()->new DataNotFoundException("data not found"+id));
		if(admin==null) {
//			return new  ResponseEntity<String>("No data is deleted",HttpStatus.FOUND) ;
			throw new DataNotFoundException();
		}else {
			return new  ResponseEntity<String>("data is deleted",HttpStatus.FOUND) ;
		}
		
//		 repository.deleteById(id);
	}



}
