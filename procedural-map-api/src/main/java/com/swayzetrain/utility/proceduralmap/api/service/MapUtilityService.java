package com.swayzetrain.utility.proceduralmap.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.swayzetrain.utility.proceduralmap.common.enums.TileCategory;
import com.swayzetrain.utility.proceduralmap.common.model.Coordinate;
import com.swayzetrain.utility.proceduralmap.common.model.Map;
import com.swayzetrain.utility.proceduralmap.common.model.MapDataPoint;
import com.swayzetrain.utility.proceduralmap.common.service.RandomizationService;

@Service
public class MapUtilityService {

	public List<Coordinate> findCoordinateOfGivenCategory(MapDataPoint[][] map, Integer quantity, TileCategory tileCategory) {

		RandomizationService randomizationService = new RandomizationService(new Random().nextLong());

		List<Coordinate> coordinates = new ArrayList<>();
		
		if(null == quantity) {
			quantity = 1;
		}
		
		for(int x = 0; x < quantity; x++) {
			Coordinate coordinate;
			do {
				coordinate = randomizationService.generateRandomCoordinate(map[0].length, map.length);
			} while (map[coordinate.getY()][coordinate.getX()].getTileCategory() != tileCategory);
			
			coordinates.add(coordinate);
		}
		
		return coordinates;
	}

	public List<Coordinate> findCoordinateOfGivenCategory(MapDataPoint[][] map, Integer quantity, RandomizationService randomizationService,
			TileCategory tileCategory) {

		List<Coordinate> coordinates = new ArrayList<>();
		
		if(null == quantity) {
			quantity = 1;
		}
		
		for(int x = 0; x < quantity; x++) {
			Coordinate coordinate;
			do {
				coordinate = randomizationService.generateRandomCoordinate(map[0].length, map.length);
			} while (map[coordinate.getY()][coordinate.getX()].getTileCategory() == tileCategory);
			
			coordinates.add(coordinate);
		}
		
		return coordinates;
		
	}
	
	public Coordinate findCoordinateOfGivenCategory(MapDataPoint[][] map, RandomizationService randomizationService,
			TileCategory tileCategory) {

		Coordinate coordinate = randomizationService.generateRandomCoordinate(map[0].length, map.length);

		if (map[coordinate.getY()][coordinate.getX()].getTileCategory() == tileCategory) {
			return coordinate;
		} else {
			return findCoordinateOfGivenCategory(map, randomizationService, tileCategory);
		}
	}
	
	public Integer[][] getMapAsIntegerArray(Map map) {
		Integer[][] resultArray = new Integer[map.getMapMetadata().getHeight()][map.getMapMetadata().getWidth()];
		
		for(int y = 0; y < map.getMapData().length; y++) {
			for(int x = 0; x < map.getMapData()[y].length; x++) {
				if(map.getMapMetadata().isEdgePostProcessingEnabled()) {
					resultArray[y][x] = map.getMapData()[y][x].getPostProcessedTileType().getValue();
				} else {
					resultArray[y][x] = map.getMapData()[y][x].getTileCategory().getValue();
				}
			}
		}
		return resultArray;
	}

}
