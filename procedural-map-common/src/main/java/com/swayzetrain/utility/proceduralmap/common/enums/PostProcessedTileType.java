package com.swayzetrain.utility.proceduralmap.common.enums;

public enum PostProcessedTileType {
	
	/*
	 * Current Tile Types
	 * 0 = simple wall
	 * 1 = Left Upper Group wall
	 * 2 = Mid Upper Group wall
	 * 3 = Right Upper Group wall
	 * 4 = Left Middle Group wall
	 * 5 = Mid Middle Group wall
	 * 6 = Mid Middle No Upper Left Group Wall
	 * 7 = Mid Middle No Upper Right Group Wall
	 * 8 = Mid Middle No Bottom Left Group Wall
	 * 9 = Mid Middle No Bottom Right Group Wall
	 * 10 = Right Middle Group wall
	 * 11 = Left Bottom Group wall
	 * 12 = Mid Bottom Group wall
	 * 13 = Right Bottom Group wall
	 * 14 = Bottom Left Upper Right Group Wall
	 * 15 - Upper Left Bottom Right Group Wall
	 * 20 = walkable path
	 */
	
	SIMPLE_WALL(0),
	LEFT_UPPER_GROUP_WALL(1),
	MID_UPPER_GROUP_WALL(2),
	RIGHT_UPPER_GROUP_WALL(3),
	LEFT_MIDDLE_GROUP_WALL(4),
	MID_MIDDLE_GROUP_WALL(5),
	MID_MIDDLE_NO_UPPER_LEFT_GROUP_WALL(6),
	MID_MIDDLE_NO_UPPER_RIGHT_GROUP_WALL(7),
	MID_MIDDLE_NO_BOTTOM_LEFT_GROUP_WALL(8),
	MID_MIDDLE_NO_BOTTOM_RIGHT_GROUP_WALL(9),
	RIGHT_MIDDLE_GROUP_WALL(10),
	LEFT_BOTTOM_GROUP_WALL(11),
	MID_BOTTOM_GROUP_WALL(12),
	RIGHT_BOTTOM_GROUP_WALL(13),
	BOTTOM_LEFT_UPPER_RIGHT_GROUP_WALL(14),
	UPPER_LEFT_BOTTOM_RIGHT_GROUP_WALL(15),
	PATH(20);
	
	private final int value;
	
	PostProcessedTileType(final int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}

}
