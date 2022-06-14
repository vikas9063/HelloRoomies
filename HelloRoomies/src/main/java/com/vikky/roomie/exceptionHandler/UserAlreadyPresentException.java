package com.vikky.roomie.exceptionHandler;

public class UserAlreadyPresentException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public UserAlreadyPresentException(String errorMessage) {
		super(errorMessage);
	}

}
