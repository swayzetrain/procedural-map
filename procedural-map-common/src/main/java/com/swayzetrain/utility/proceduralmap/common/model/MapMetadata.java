package com.swayzetrain.utility.proceduralmap.common.model;

import com.swayzetrain.utility.proceduralmap.common.enums.MapAlgorithm;

public class MapMetadata {
	
	private MapAlgorithm mapAlgorithm;
	private Integer height;
	private Integer width;
	private Integer maxTunnels;
	private Integer maxLength;
	private Integer treasures;

	public MapAlgorithm getMapAlgorithm() {
		return mapAlgorithm;
	}

	public void setMapAlgorithm(MapAlgorithm mapAlgorithm) {
		this.mapAlgorithm = mapAlgorithm;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getMaxTunnels() {
		return maxTunnels;
	}

	public void setMaxTunnels(Integer maxTunnels) {
		this.maxTunnels = maxTunnels;
	}

	public Integer getMaxLength() {
		return maxLength;
	}

	public void setMaxLength(Integer maxLength) {
		this.maxLength = maxLength;
	}

	public Integer getTreasures() {
		return treasures;
	}

	public void setTreasures(Integer treasures) {
		this.treasures = treasures;
	}

}
