package com.jsp.springrest_crud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.jsp.springrest_crud.dto.Admin;

@Component
public interface Adminrepository extends JpaRepository<Admin, Integer> {

	List<Admin> findByEmail(String email);

	List<Admin> findByEmailAndPassword(String email, String password);

	
	
}
