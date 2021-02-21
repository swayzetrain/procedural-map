package com.swayzetrain.utility.proceduralmap.common.service;

import javax.validation.Validation;
import javax.validation.Validator;

import org.springframework.stereotype.Service;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.beanvalidation.SpringValidatorAdapter;

import com.swayzetrain.utility.proceduralmap.common.exception.InvalidRequestException;

@Service
public class ValidationService {
	
	private static final Validator javaxValidator = Validation.buildDefaultValidatorFactory().getValidator();
	private static final SpringValidatorAdapter validator = new SpringValidatorAdapter(javaxValidator);
	
	public Object validate(Object entry, Class<?> entryClassGroup) {
		BeanPropertyBindingResult errors = new BeanPropertyBindingResult(entry, entryClassGroup.getName());
		validator.validate(entry, errors, entryClassGroup);
		if(errors.getAllErrors().isEmpty()) {
			return entry;
		} else {
			throw new InvalidRequestException(errors.getAllErrors().toString(), errors.getAllErrors());
		}
	}
	

}
