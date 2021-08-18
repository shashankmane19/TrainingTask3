package com.sm.springbootstudentjpa.exception;

public class StudentNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = -9079454849611061074L;

	public StudentNotFoundException() {
		super();
	}

	public StudentNotFoundException(final String message) {
		super(message);
	}

}
