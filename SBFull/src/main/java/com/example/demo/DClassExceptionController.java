package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class DClassExceptionController {
	
	
	@ExceptionHandler(value = DClassException.class)
	public ResponseEntity<String> exception(DClassException exception) {
	
		return new ResponseEntity<>("THIS IS A EXCEPTION BUT RESOURCE IS CREATED",HttpStatus.EXPECTATION_FAILED);
	
	}

}
