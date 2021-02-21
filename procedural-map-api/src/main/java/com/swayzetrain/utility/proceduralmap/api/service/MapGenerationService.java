package com.swayzetrain.utility.proceduralmap.api.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.swayzetrain.utility.proceduralmap.api.service.randomwalk.RandomWalkService;
import com.swayzetrain.utility.proceduralmap.common.enums.TileType;
import com.swayzetrain.utility.proceduralmap.common.model.Map;
import com.swayzetrain.utility.proceduralmap.common.model.MapMetadata;
import com.swayzetrain.utility.proceduralmap.common.service.RandomizationService;
import com.swayzetrain.utility.proceduralmap.common.service.ValidationService;

@Service
public class MapGenerationService {
	
	@Autowired
	private MapUtilityService mapUtilityService;
	
	@Autowired
	private ValidationService validationService;
	
	public ResponseEntity<Map> generateMap(MapMetadata mapMetadata) {		
		Map map = new Map();
		
		Integer [][] mapData;
		
		generateSeedIfNotProvided(mapMetadata);
		RandomizationService randomizationService = new RandomizationService(mapMetadata.getSeed());
		
		switch(mapMetadata.getMapAlgorithm()) {
		case RANDOM_WALK:
			validationService.validate(mapMetadata, MapMetadata.NewRandomWalk.class);
			
			RandomWalkService randomWalkService = new RandomWalkService(mapMetadata.getWidth(), mapMetadata.getHeight(), randomizationService);
			mapData = randomWalkService.generateRandomWalkMap(mapMetadata.getMaxTunnels(), mapMetadata.getMaxLength(), mapMetadata.getTreasures());
			
			if(null != mapMetadata.getTreasures()) {
				mapUtilityService.buryTreasureInMap(mapData, mapMetadata.getTreasures(), randomizationService);
			}
			
			if(mapMetadata.isGenerateSpawnCoordinate()) {
				mapMetadata.setSpawnCoordinate(mapUtilityService.findCoordinateofGivenType(mapData, randomizationService, TileType.PATH));
			}
			
			//printMapToConsole(mapData);
			break;
		default:
			mapData = new Integer [1][1];
			break;
		}
		
		map.setMapMetadata(mapMetadata);
		map.setMapData(mapData);
		
		return new ResponseEntity<>(map, HttpStatus.OK);
	}
	
	private void printMapToConsole(Integer[][] map) {
		
		for(int y = 0; y < map.length; y++) {
			System.out.print("|");
			for(int x = 0; x < map[0].length; x++) {
				if(map[y][x] == 1) {
					System.out.print(" ");
				} else if(map[y][x] == 2){
					System.out.print("\u001B[32m" + map[y][x] + "\u001B[0m");
				} else {
					System.out.print(map[y][x]);
				}
			}
			System.out.println("|");
		}
	}
	
	private void generateSeedIfNotProvided(MapMetadata mapMetadata) {
		if(null == mapMetadata.getSeed()) {
			mapMetadata.setSeed(new Random().nextLong());
		}
	}

}
