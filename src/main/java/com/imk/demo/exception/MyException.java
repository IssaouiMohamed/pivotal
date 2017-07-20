package com.imk.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "An error message has occurred ..!")
public class MyException extends Exception {

	/**
	 * Custom exception
	 */
	private static final long serialVersionUID = 1L;

	private String message;

	private HttpStatus status;

	public MyException(String message, HttpStatus status) {
		super(message);
		this.message = message;
		this.status=status;
	}

	public MyException() {
		super();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

}
