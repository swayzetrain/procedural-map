package com.swayzetrain.utility.proceduralmap.api.service.randomwalk;

import com.swayzetrain.utility.proceduralmap.common.enums.Direction;
import com.swayzetrain.utility.proceduralmap.common.model.Coordinate;
import com.swayzetrain.utility.proceduralmap.common.service.RandomizationService;

public class RandomWalkService {
	
	private Integer[][] map;
	private RandomizationService randomizationService;
	private Integer buryCounter = 0;
	
	public RandomWalkService() {}
	
	public RandomWalkService(Integer width, Integer height) {
		map = new Integer[height][width];
		initializeMap();
		randomizationService = new RandomizationService();
	}
	
	public Integer[][] generateRandomWalkMap(Integer maxTunnels, Integer maxLength, Integer treasures) {
		Integer width = map[0].length;
		Integer height = map.length;
		
		Coordinate coordinate = randomizationService.generateRandomCoordinate(width, height);
		map[coordinate.getY()][coordinate.getX()] = 1;
		
		for(int tunnelCount = 0; tunnelCount < maxTunnels; tunnelCount++) {
			Direction directionToWalk = randomizationService.generateRandomDirection();
			Integer tunnelLength = randomizationService.generateRandomIntegerExcludingZero(maxLength);
			
			walk(coordinate, directionToWalk, tunnelLength, width, height);
		}
		
		for(int treasureCount = 0; treasureCount < treasures; treasureCount++) {
			buryTreasure();
		}
		
		System.out.println("BuryCounter: " + buryCounter + "\n\n");
		
		return map;
	}
	
	private void walk(Coordinate coordinate, Direction direction, Integer walkingDistance, Integer mapWidth, Integer mapHeight) {
		switch(direction) {
		case LEFT:
			for(Integer distanceTraveled = 0; distanceTraveled < walkingDistance; distanceTraveled++) {
				if(coordinate.getX() - 1 < 0) {
					break;
				}
				
				coordinate.setX(coordinate.getX() - 1);
				map[coordinate.getY()][coordinate.getX()] = 1;
			}
			break;
		case RIGHT:
			for(Integer distanceTraveled = 0; distanceTraveled < walkingDistance; distanceTraveled++) {
				if(coordinate.getX() + 1 >= mapWidth) {
					break;
				}
				
				coordinate.setX(coordinate.getX() + 1);
				map[coordinate.getY()][coordinate.getX()] = 1;
			}
			break;
		case UP:
			for(Integer distanceTraveled = 0; distanceTraveled < walkingDistance; distanceTraveled++) {
				if(coordinate.getY() - 1 < 0) {
					break;
				}
				
				coordinate.setY(coordinate.getY() - 1);
				map[coordinate.getY()][coordinate.getX()] = 1;
			}
			break;
		case DOWN:
			for(Integer distanceTraveled = 0; distanceTraveled < walkingDistance; distanceTraveled++) {
				if(coordinate.getY() + 1 >= mapHeight) {
					break;
				}
				
				coordinate.setY(coordinate.getY() + 1);
				map[coordinate.getY()][coordinate.getX()] = 1;
			}
			break;
		default:
			break;
		}
	}
	
	private void initializeMap() {
		for(int y = 0; y < map.length; y++) {
			for(int x = 0; x < map[0].length; x++) {
				map[y][x] = 0;
			}
		}
	}
	
	private void buryTreasure() {
		buryCounter++;
		Coordinate coordinate = randomizationService.generateRandomCoordinate(map[0].length, map.length);
		
		if(map[coordinate.getY()][coordinate.getX()] == 1) {
			map[coordinate.getY()][coordinate.getX()] = 2;
		} else {
			buryTreasure();
		}
	}
}
