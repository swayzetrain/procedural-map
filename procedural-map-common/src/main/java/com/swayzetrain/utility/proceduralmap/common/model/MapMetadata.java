package com.swayzetrain.utility.proceduralmap.common.model;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.swayzetrain.utility.proceduralmap.common.enums.MapAlgorithm;

@JsonInclude(Include.NON_NULL)
public class MapMetadata {

	@NotNull(groups = { New.class }, message = "mapAlgorithm is required for this call")
	private MapAlgorithm mapAlgorithm;

	@NotNull(groups = { New.class }, message = "height is required for this call")
	private Integer height;

	@NotNull(groups = { New.class }, message = "width is required for this call")
	private Integer width;

	@NotNull(groups = { NewRandomWalk.class }, message = "maxTunnels is required for this call")
	private Integer maxTunnels;

	@NotNull(groups = { NewRandomWalk.class }, message = "maxLength is required for this call")
	private Integer maxLength;

	private Integer treasures;

	private Long seed;

	private Coordinate spawnCoordinate;

	@NotNull(groups = { New.class }, message = "generateSpawnCoordinate is required for this call")
	@JsonProperty(access = Access.WRITE_ONLY)
	private boolean generateSpawnCoordinate;

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

	public Long getSeed() {
		return seed;
	}

	public void setSeed(Long seed) {
		this.seed = seed;
	}

	public Coordinate getSpawnCoordinate() {
		return spawnCoordinate;
	}

	public void setSpawnCoordinate(Coordinate spawnCoordinate) {
		this.spawnCoordinate = spawnCoordinate;
	}

	public boolean isGenerateSpawnCoordinate() {
		return generateSpawnCoordinate;
	}

	public void setGenerateSpawnCoordinate(boolean generateSpawnCoordinate) {
		this.generateSpawnCoordinate = generateSpawnCoordinate;
	}

	public interface New {
	};

	public interface NewRandomWalk {
	};

}
