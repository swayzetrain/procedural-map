package com.swayzetrain.utility.proceduralmap.common.exception;

import java.util.List;

import org.springframework.validation.ObjectError;

public class InvalidRequestException extends RuntimeException {

	private static final long serialVersionUID = 3603451084219783830L;
	
	private final transient List<ObjectError> errors;
	
	public InvalidRequestException(String message, List<ObjectError> errors) {
		super(message);
		this.errors = errors;
	}
	
	public List<ObjectError> getErrors() {
		return errors;
	}

}
