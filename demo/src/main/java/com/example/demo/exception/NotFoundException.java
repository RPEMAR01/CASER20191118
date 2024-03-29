package com.example.demo.exception;

public class NotFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	public NotFoundException() {
		this("Not found");
	}

	public NotFoundException(String message) {
		super(message);
	}

	public NotFoundException(Throwable cause) {
		this("Not found", cause);
	}

	public NotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public NotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
