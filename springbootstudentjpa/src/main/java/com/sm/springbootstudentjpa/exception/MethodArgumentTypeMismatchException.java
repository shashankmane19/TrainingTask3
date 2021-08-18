package com.sm.springbootstudentjpa.exception;

public class MethodArgumentTypeMismatchException extends RuntimeException {
	
	private static final long serialVersionUID = -9079454849611061074L;

	public MethodArgumentTypeMismatchException () {
		super();
	}

	public MethodArgumentTypeMismatchException (final String message) {
		super(message);
	}

}
