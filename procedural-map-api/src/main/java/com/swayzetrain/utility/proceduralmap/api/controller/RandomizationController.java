package com.swayzetrain.utility.proceduralmap.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.swayzetrain.utility.proceduralmap.common.enums.Direction;
import com.swayzetrain.utility.proceduralmap.common.service.RandomizationService;

@RestController
public class RandomizationController {

	@GetMapping("/v1/randomization/directions")
	public ResponseEntity<Direction> getRandomDirection() {
		RandomizationService randomizationService = new RandomizationService();
		
		return new ResponseEntity<>(randomizationService.generateRandomDirection(), HttpStatus.OK);
	}
	
	@GetMapping("/v1/randomization/integers")
	public ResponseEntity<Integer> getRandomInteger(@RequestParam(required=true) Integer maxLength) {
		RandomizationService randomizationService = new RandomizationService();
		
		return new ResponseEntity<>(randomizationService.generateRandomIntegerExcludingZero(maxLength), HttpStatus.OK);
	}
	
}
