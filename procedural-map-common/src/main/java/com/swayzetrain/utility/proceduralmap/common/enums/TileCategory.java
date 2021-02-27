package com.swayzetrain.utility.proceduralmap.common.enums;

public enum TileCategory {
	
	/*
	 * Current Tile Types
	 * 0 = walls
	 * 1 = walkable path
	 * 2 = walkable path with treasure beneath it
	 * 
	 */
	
	WALL(0),
	PATH(1);
	
	private final int value;
	
	TileCategory(final int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}

}
