package com.bhandari.exceptionHandling;

public class UserNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserNotFoundException() {
	}

	public UserNotFoundException(String msg) {
		super(msg);
		System.out.println("UserNotFoundException class is executing");
	}

}
