package com.vikky.roomie.exceptionHandler;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

}
