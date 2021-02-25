package com.swayzetrain.utility.proceduralmap.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.swayzetrain.utility.proceduralmap.api.service.MapUtilityService;
import com.swayzetrain.utility.proceduralmap.common.enums.Direction;
import com.swayzetrain.utility.proceduralmap.common.enums.TileType;
import com.swayzetrain.utility.proceduralmap.common.model.Coordinate;
import com.swayzetrain.utility.proceduralmap.common.service.RandomizationService;

@RestController
public class RandomizationController {
	
	@Autowired
	MapUtilityService mapUtilityService;

	@GetMapping("/v1/randomization/directions")
	public ResponseEntity<Direction> getRandomDirection(@RequestParam(required=true) Long seed) {
		RandomizationService randomizationService = new RandomizationService(seed);
		
		return new ResponseEntity<>(randomizationService.generateRandomDirection(), HttpStatus.OK);
	}
	
	@GetMapping("/v1/randomization/integers")
	public ResponseEntity<Integer> getRandomInteger(@RequestParam(required=true) Integer maxLength, @RequestParam(required=true) Long seed) {
		RandomizationService randomizationService = new RandomizationService(seed);
		
		return new ResponseEntity<>(randomizationService.generateRandomIntegerExcludingZero(maxLength), HttpStatus.OK);
	}
	
	@PostMapping("/v1/randomization/path-coordinates")
	public ResponseEntity<Coordinate> createRandomPathCoordinate(@RequestBody Integer[][] map) {
		return new ResponseEntity<>(mapUtilityService.findCoordinateofGivenType(map, TileType.PATH), HttpStatus.OK);
	}
	
}
