package com.swayzetrain.utility.proceduralmap.api.service;

import org.springframework.stereotype.Service;

import com.swayzetrain.utility.proceduralmap.common.enums.TileType;
import com.swayzetrain.utility.proceduralmap.common.model.Coordinate;
import com.swayzetrain.utility.proceduralmap.common.service.RandomizationService;

@Service
public class MapUtilityService {

	public void buryTreasureInMap(Integer[][] map, Integer treasureCount, RandomizationService randomizationService) {
		for(int treasuresBurried = 0; treasuresBurried < treasureCount; treasuresBurried++) {
			Coordinate coordinate = findCoordinateofGivenType(map, randomizationService, TileType.PATH);
			map[coordinate.getY()][coordinate.getX()] = TileType.PATH_TREASURE.getValue();
		}
	}
	
	public Coordinate findCoordinateofGivenType(Integer[][] map, RandomizationService randomizationService, TileType tileType) {
		
		Coordinate coordinate = randomizationService.generateRandomCoordinate(map[0].length, map.length);
		
		if(map[coordinate.getY()][coordinate.getX()] == tileType.getValue()) {
			return coordinate;
		} else {
			return findCoordinateofGivenType(map, randomizationService, tileType);
		}
	}
	
	
	
}
