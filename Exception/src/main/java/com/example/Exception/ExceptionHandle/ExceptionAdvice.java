package com.example.Exception.ExceptionHandle;

import java.time.LocalDateTime;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice

public class ExceptionAdvice 
{
	
	@ExceptionHandler(value = ExistUserIdException.class)
	public ResponseEntity<Exceptionhandlerss> ExistUserIdException(ExistUserIdException e) 
	{
		Exceptionhandlerss error = new Exceptionhandlerss("404","ID NOT FOUND");
		error.setTime(LocalDateTime.now());
		error.setStatus((HttpStatus.BAD_REQUEST.value()));
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value= ExistUserName.class)
	public ResponseEntity<Exceptionhandlerss>ExistUserName(ExistUserName e)
	{
		Exceptionhandlerss error1 = new Exceptionhandlerss("404","Name not found");
		error1.setTime(LocalDateTime.now());
		error1.setStatus(HttpStatus.BAD_REQUEST.value());
		return new ResponseEntity<>(error1,HttpStatus.NOT_FOUND);
	}

	
}
