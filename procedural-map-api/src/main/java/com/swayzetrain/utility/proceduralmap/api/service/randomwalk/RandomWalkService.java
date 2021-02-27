package com.swayzetrain.utility.proceduralmap.api.service.randomwalk;

import com.swayzetrain.utility.proceduralmap.common.enums.Direction;
import com.swayzetrain.utility.proceduralmap.common.enums.TileCategory;
import com.swayzetrain.utility.proceduralmap.common.model.Coordinate;
import com.swayzetrain.utility.proceduralmap.common.model.MapDataPoint;
import com.swayzetrain.utility.proceduralmap.common.service.RandomizationService;

public class RandomWalkService {
	
	private MapDataPoint[][] map;
	private RandomizationService randomizationService;
	
	public RandomWalkService() {}
	
	public RandomWalkService(Integer width, Integer height, RandomizationService randomizationService) {
		map = new MapDataPoint[height][width];
		initializeMap();
		this.randomizationService = randomizationService;
	}
	
	public MapDataPoint[][] generateRandomWalkMap(Integer maxTunnels, Integer maxLength) {
		Integer width = map[0].length;
		Integer height = map.length;
		
		Coordinate coordinate = randomizationService.generateRandomCoordinate(width, height);
		map[coordinate.getY()][coordinate.getX()].setTileCategory(TileCategory.PATH);
		
		for(int tunnelCount = 0; tunnelCount < maxTunnels; tunnelCount++) {
			Direction directionToWalk = randomizationService.generateRandomDirection();
			Integer tunnelLength = randomizationService.generateRandomIntegerExcludingZero(maxLength);
			
			walk(coordinate, directionToWalk, tunnelLength, width, height);
		}
		
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
				map[coordinate.getY()][coordinate.getX()].setTileCategory(TileCategory.PATH);
			}
			break;
		case RIGHT:
			for(Integer distanceTraveled = 0; distanceTraveled < walkingDistance; distanceTraveled++) {
				if(coordinate.getX() + 1 >= mapWidth) {
					break;
				}
				
				coordinate.setX(coordinate.getX() + 1);
				map[coordinate.getY()][coordinate.getX()].setTileCategory(TileCategory.PATH);
			}
			break;
		case UP:
			for(Integer distanceTraveled = 0; distanceTraveled < walkingDistance; distanceTraveled++) {
				if(coordinate.getY() - 1 < 0) {
					break;
				}
				
				coordinate.setY(coordinate.getY() - 1);
				map[coordinate.getY()][coordinate.getX()].setTileCategory(TileCategory.PATH);
			}
			break;
		case DOWN:
			for(Integer distanceTraveled = 0; distanceTraveled < walkingDistance; distanceTraveled++) {
				if(coordinate.getY() + 1 >= mapHeight) {
					break;
				}
				
				coordinate.setY(coordinate.getY() + 1);
				map[coordinate.getY()][coordinate.getX()].setTileCategory(TileCategory.PATH);
			}
			break;
		default:
			break;
		}
	}
	
	private void initializeMap() {
		for(int y = 0; y < map.length; y++) {
			for(int x = 0; x < map[0].length; x++) {
				map[y][x] = new MapDataPoint();
				map[y][x].setTileCategory(TileCategory.WALL);
			}
		}
	}
}
