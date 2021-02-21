package com.swayzetrain.utility.proceduralmap.api.controller;

import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.util.HtmlUtils;

import com.swayzetrain.utility.proceduralmap.common.enums.ErrorLevel;
import com.swayzetrain.utility.proceduralmap.common.exception.InvalidAttributeException;
import com.swayzetrain.utility.proceduralmap.common.exception.InvalidRequestException;
import com.swayzetrain.utility.proceduralmap.common.model.ErrorResponse;

@RestControllerAdvice
public class ControllerAdvice {

	@ExceptionHandler(InvalidRequestException.class)
	public ResponseEntity<ErrorResponse> handleInvalidRequestException(InvalidRequestException ex) {
		String message = ex.getErrors().stream().map(ObjectError::getDefaultMessage).collect(Collectors.joining(", "));
		
		return new ResponseEntity<>(new ErrorResponse(message, ErrorLevel.WARN), HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler({ InvalidAttributeException.class, IllegalArgumentException.class, MethodArgumentTypeMismatchException.class } )
	public ResponseEntity<ErrorResponse> handleBadRequestException(RuntimeException ex) {
		return new ResponseEntity<>(new ErrorResponse(HtmlUtils.htmlEscape(ex.getMessage()), ErrorLevel.WARN), HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorResponse> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
		String message = ex.getBindingResult().getAllErrors().stream().map(ObjectError::getDefaultMessage).collect(Collectors.joining(", "));
		
		return new ResponseEntity<>(new ErrorResponse(message, ErrorLevel.WARN), HttpStatus.BAD_REQUEST);
	}
	
}
