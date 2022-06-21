package com.vikky.roomie.exceptionHandler;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.vikky.roomie.util.ResponseMessage;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = { NoSuchElementException.class })
	public ResponseEntity<ResponseMessage> userNotFound(NoSuchElementException ex) {
		return new ResponseEntity<ResponseMessage>(
				new ResponseMessage("user is not avaliable with given Id", "Error", ex.getMessage()), HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value = {UserAlreadyPresentException.class})
	public ResponseEntity<ResponseMessage> userIsAlreadyPresent(UserAlreadyPresentException ex) {
		return new ResponseEntity<ResponseMessage>(
				new ResponseMessage("user is already avaliable with given Email Id", "Error", ex.getMessage()), HttpStatus.METHOD_NOT_ALLOWED);
	}
	@ExceptionHandler(value = {BadCredentialsException.class})
	public ResponseEntity<ResponseMessage> badCredentialException(BadCredentialsException ex){
		return new ResponseEntity<ResponseMessage>(new ResponseMessage("Bad Credentials","ERROR",ex.getMessage()),HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(value = {DisabledException.class})
	public ResponseEntity<ResponseMessage> disabledException(DisabledException ex){
		return new ResponseEntity<ResponseMessage>(new ResponseMessage("User is Disabled Credentials","ERROR",ex.getMessage()),HttpStatus.BAD_REQUEST);
	}
}
