package com.test.dockerise.exception;

public class UserNotFoundException extends RuntimeException {
	
	public UserNotFoundException(String message)
	{
		super(message);
	}

}
