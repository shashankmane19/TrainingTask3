package com.sm.springbootstudentjpa.exception;

public class MethodArgumentNotValidException extends RuntimeException {
	
	private static final long serialVersionUID = -9079454849611061074L;

	public MethodArgumentNotValidException () {
		super();
	}

	public MethodArgumentNotValidException(final String message) {
		super(message);
	}


}
