package com.swayzetrain.utility.proceduralmap.common.enums;

public enum TileType {
	
	/*
	 * Current Tile Types
	 * 0 = walls
	 * 1 = walkable path
	 * 2 = walkable path with treasure beneath it
	 * 
	 */
	
	WALL(0),
	PATH(1),
	PATH_TREASURE(2);
	
	private final int value;
	
	TileType(final int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}

}
