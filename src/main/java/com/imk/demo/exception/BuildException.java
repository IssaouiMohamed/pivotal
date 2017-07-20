package com.imk.demo.exception;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * 
 * @author issaoumo
 * 
 * Build exception model
 *
 */


@JsonPropertyOrder
public class BuildException {
	
	private HttpStatus statusCode;
	private String cause;
	private String errorMessage;

	
	public BuildException(HttpStatus statusCode, String cause, String errorMessage) {
		super();
		this.statusCode = statusCode;
		this.cause = cause;
		this.errorMessage = errorMessage;
	}
	
	
	public HttpStatus getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(HttpStatus statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return cause;
	}
	public void setMessage(String message) {
		this.cause = message;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
	
	

}
