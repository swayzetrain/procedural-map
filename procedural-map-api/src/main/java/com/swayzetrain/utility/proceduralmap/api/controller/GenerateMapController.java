package com.swayzetrain.utility.proceduralmap.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.swayzetrain.utility.proceduralmap.api.service.MapGenerationService;
import com.swayzetrain.utility.proceduralmap.common.model.Map;
import com.swayzetrain.utility.proceduralmap.common.model.MapMetadata;

@RestController
public class GenerateMapController {
	
	@Autowired
	private MapGenerationService mapGenerationService;
	
	@PostMapping("/v1/generate-map")
	public ResponseEntity<Map> generateMap(@RequestBody @Validated(MapMetadata.New.class) MapMetadata mapMetadata) {
		return mapGenerationService.generateMap(mapMetadata);
	}

}
