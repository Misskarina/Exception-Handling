package com.karina.ExceptionHandling;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<ErrorDto> generateException(RuntimeException ex)
	{
		ErrorDto dto=new ErrorDto();
		dto.setTimestamp(new Date().toString());
		dto.setStatus(601);
		dto.setMessage(ex.getMessage());
		
		return new ResponseEntity<ErrorDto>(dto,HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
