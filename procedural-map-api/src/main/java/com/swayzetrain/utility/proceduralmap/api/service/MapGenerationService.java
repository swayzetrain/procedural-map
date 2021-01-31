package com.swayzetrain.utility.proceduralmap.api.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.swayzetrain.utility.proceduralmap.api.service.randomwalk.RandomWalkService;
import com.swayzetrain.utility.proceduralmap.common.model.MapMetadata;

@Service
public class MapGenerationService {
	
	public ResponseEntity<Integer[][]> generateMap(MapMetadata mapMetadata) {
		
		Integer [][] map;
		
		switch(mapMetadata.getMapAlgorithm()) {
		case RANDOM_WALK:
			RandomWalkService randomWalkService = new RandomWalkService(mapMetadata.getWidth(), mapMetadata.getHeight());
			map = randomWalkService.generateRandomWalkMap(mapMetadata.getMaxTunnels(), mapMetadata.getMaxLength(), mapMetadata.getTreasures());
			printMapToConsole(map);
			break;
		default:
			map = new Integer [1][1];
			break;
		}
		
		return new ResponseEntity<>(map, HttpStatus.OK);
	}
	
	private void printMapToConsole(Integer[][] map) {
		
		for(int y = 0; y < map[0].length; y++) {
			System.out.print("|");
			for(int x = 0; x < map.length; x++) {
				if(map[x][y] == 1) {
					System.out.print(" ");
				} else if(map[x][y] == 2){
					System.out.print("\u001B[32m" + map[x][y] + "\u001B[0m");
				} else {
					System.out.print(map[x][y]);
				}
			}
			System.out.println("|");
		}
	}

}
