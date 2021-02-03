package com.example.MongoBasicProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.TransactionSystemException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;


@ControllerAdvice
public class CustomExceptionHandler
//extends ResponseEntityExceptionHandler {
{

	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public @ResponseBody List<String> handleValidationExceptionsM(
	  MethodArgumentNotValidException ex) {
		List<String> errors = new ArrayList<String>();
	    ex.getBindingResult().getAllErrors().forEach((error) -> {
	    	String fieldName = ( error).getObjectName();
	        String errorMessage = error.getDefaultMessage();
	        errors.add( errorMessage);
	    });
	    return errors;
	}
}
