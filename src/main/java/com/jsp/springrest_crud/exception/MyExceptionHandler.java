package com.jsp.springrest_crud.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


//controller advivce is a container where all exception are come to this container
@RestControllerAdvice
public class MyExceptionHandler {
	
	@ExceptionHandler(DataNotFoundException.class)
	public ResponseEntity<String> exception(DataNotFoundException exception){
		return new ResponseEntity<String>(exception.msg, HttpStatus.NOT_FOUND);
	}

}
