package com.swayzetrain.utility.proceduralmap.common.model;

public class Map {
	
	private Integer[][] mapData;
	private MapMetadata mapMetadata;

	public Integer[][] getMapData() {
		return mapData;
	}

	public void setMapData(Integer[][] mapData) {
		this.mapData = mapData;
	}

	public MapMetadata getMapMetadata() {
		return mapMetadata;
	}

	public void setMapMetadata(MapMetadata mapMetadata) {
		this.mapMetadata = mapMetadata;
	}

}
