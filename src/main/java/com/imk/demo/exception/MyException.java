package com.imk.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "An error message has occurred ..!")
public class MyException extends Exception{

	/**
	 * Custom exception
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String message ;
	
	public MyException(String message) {
		super(message);
		this.message=message;		
	}

	public MyException( ) {
		super( );
	}

	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	
	

}
