package com.swayzetrain.utility.proceduralmap.common.model;

public class Map {
	
	private MapDataPoint[][] mapData;
	private MapMetadata mapMetadata;

	public MapDataPoint[][] getMapData() {
		return mapData;
	}

	public void setMapData(MapDataPoint[][] mapData) {
		this.mapData = mapData;
	}

	public MapMetadata getMapMetadata() {
		return mapMetadata;
	}

	public void setMapMetadata(MapMetadata mapMetadata) {
		this.mapMetadata = mapMetadata;
	}

}
