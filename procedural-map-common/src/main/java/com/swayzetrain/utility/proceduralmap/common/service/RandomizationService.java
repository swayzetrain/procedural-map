package com.swayzetrain.utility.proceduralmap.common.service;

import java.util.Random;

import com.swayzetrain.utility.proceduralmap.common.enums.Direction;
import com.swayzetrain.utility.proceduralmap.common.model.Coordinate;

public class RandomizationService {
	
	Random generator;
	
	public RandomizationService() {
		generator = new Random();
	}
	
	public Direction generateRandomDirection() {
		Integer directionValue = generator.nextInt(4);
		return Direction.valueOf(directionValue);
	}
	
	public Integer generateRandomIntegerExcludingZero(Integer maxLength) {
		return generator.nextInt(maxLength) + 1;
	}
	
	public Coordinate generateRandomCoordinate(Integer width, Integer height) {
		Coordinate coordinate = new Coordinate();
		coordinate.setX(generator.nextInt(width));
		coordinate.setY(generator.nextInt(height));
		
		return coordinate;
	}
}
