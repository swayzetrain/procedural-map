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
	 * 
	 * 20 = simple path
	 * 21 = Left Upper Edge
	 * 22 = Mid Upper Edge
	 * 23 = Right Upper Edge
	 * 24 = Left Middle Edge
	 * 25 = Right Middle Edge
	 * 26 = Left Bottom Edge
	 * 27 = Mid Bottom Edge
	 * 28 = Right Bottom Edge
	 * 29 = Left Upper Corner
	 * 30 = Upper Corners
	 * 31 = Right Upper Corner
	 * 32 = Left Corners
	 * 33 = Right Corners
	 * 34 = All Corners
	 * 35 = Left Bottom Corner
	 * 36 = Bottom Corners
	 * 37 = Right Bottom Corner
	 * 38 = Right Middle Edge, Left Bottom Corner
	 * 39 = Right Middle Edge, Left Upper Corner
	 * 40 = Right Middle Edge, Left Corners
	 * 41 = Left Middle Edge, Right Bottom Corner
	 * 42 = Left Middle Edge, Right Upper Corner
	 * 43 = Left Middle Edge, Right Corners
	 * 44 = Left Middle Edge, Right Middle Edge
	 * 45 = Upper Middle Edge, Bottom Middle Edge
	 * 46 = Left Middle Edge, Right Middle, Bottom Middle Edge
	 * 47 = Bottom Middle Edge, Upper Left Corner
	 * 48 = Bottom Middle Edge, Upper Corners
	 * 49 = Bottom Middle Edge, Upper Right Corner
	 * 50 = Upper Middle Edge, Bottom Left Corner
	 * 51 = Upper Middle Edge, Bottom Corners
	 * 52 = Upper Middle Edge, Bottom Right Corner
	 * 53 = Upper Left, Bottom Right Corners
	 * 54 = Upper Right, Bottom Left Corners
	 * 55 = Upper Right, Bottom Left, Bottom Right Corners
	 * 56 = Bottom Left Edge, Upper Right Corner
	 * 57 = Mid Upper Edge, Right Middle, Bottom Middle Edge
	 * 58 = Right Upper Edge, Bottom Left Corner
	 * 59 = Left Upper Edge, Bottom Right Corner
	 * 60 = Mid Upper Edge, Left Middle, Bottom Middle Edge
	 * 61 = Left Middle, Mid Upper Edge, Right Middle Edge
	 * 62 = Upper Left, Bottom Left, Bottom Right Corners
	 * 63 = Bottom Right Edge, Upper Left Corner
	 * 64 = Upper Left, Upper Right, Bottom Right Corners
	 * 65 = Upper Left, Upper Right, Bottom Left Corners
	 * 
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
	
	SIMPLE_PATH(20),
	LEFT_UPPER_EDGE_PATH(21),
	MID_UPPER_EDGE_PATH(22),
	RIGHT_UPPER_EDGE_PATH(23),
	LEFT_MIDDLE_EDGE_PATH(24),
	RIGHT_MIDDLE_EDGE_PATH(25),
	LEFT_BOTTOM_EDGE_PATH(26),
	MID_BOTTOM_EDGE_PATH(27),
	RIGHT_BOTTOM_EDGE_PATH(28),
	LEFT_UPPER_CORNER_PATH(29),
	UPPER_CORNERS_PATH(30),
	RIGHT_UPPER_CORNER_PATH(31),
	LEFT_CORNERS_PATH(32),
	RIGHT_CORNERS_PATH(33),
	ALL_CORNERS_PATH(34),
	LEFT_BOTTOM_CORNER_PATH(35),
	BOTTOM_CORNERS_PATH(36),
	RIGHT_BOTTOM_CORNER_PATH(37),
	RIGHT_MIDDLE_EDGE_LEFT_BOTTOM_CORNER_PATH(38),
	RIGHT_MIDDLE_EDGE_LEFT_UPPER_CORNER_PATH(39),
	RIGHT_MIDDLE_EDGE_LEFT_CORNERS_PATH(40),
	LEFT_MIDDLE_EDGE_RIGHT_BOTTOM_CORNER_PATH(41),
	LEFT_MIDDLE_EDGE_RIGHT_UPPER_CORNER_PATH(42),
	LEFT_MIDDLE_EDGE_RIGHT_CORNERS_PATH(43),
	LEFT_MIDDLE_EDGE_RIGHT_MIDDLE_EDGE_PATH(44),
	UPPER_MIDDLE_EDGE_BOTTOM_MIDDLE_EDGE(45),
	LEFT_MIDDLE_RIGHT_MIDDLE_BOTTOM_MIDDLE_EDGE_PATH(46),
	MID_BOTTOM_EDGE_LEFT_UPPER_CORNER_PATH(47),
	MID_BOTTOM_EDGE_UPPER_CORNERS_PATH(48),
	MID_BOTTOM_EDGE_RIGHT_UPPER_CORNER_PATH(49),
	MID_UPPER_EDGE_LEFT_BOTTOM_CORNER_PATH(50),
	MID_UPPER_EDGE_BOTTOM_CORNERS_PATH(51),
	MID_UPPER_EDGE_RIGHT_BOTTOM_CORNER_PATH(52),
	LEFT_UPPER_RIGHT_BOTTOM_CORNERS_PATH(53),
	RIGHT_UPPER_LEFT_BOTTOM_CORNERS_PATH(54),
	RIGHT_UPPER_LEFT_BOTTOM_RIGHT_BOTTOM_CORNERS_PATH(55),
	LEFT_BOTTOM_EDGE_RIGHT_UPPER_CORNER_PATH(56),
	MID_UPPER_RIGHT_MIDDLE_MID_BOTTOM_EDGE_PATH(57),
	RIGHT_UPPER_EDGE_LEFT_BOTTOM_CORNER_PATH(58),
	LEFT_UPPER_EDGE_RIGHT_BOTTOM_CORNER_PATH(59),
	MID_UPPER_LEFT_MIDDLE_MID_BOTTOM_EDGE_PATH(60),
	LEFT_MIDDLE_MID_UPPER_RIGHT_MIDDLE_EDGE_PATH(61),
	LEFT_UPPER_LEFT_BOTTOM_RIGHT_BOTTOM_CORNERS_PATH(62),
	RIGHT_BOTTOM_EDGE_LEFT_UPPER_CORNER_PATH(63),
	LEFT_UPPER_RIGHT_UPPER_RIGHT_BOTTOM_CORNERS_PATH(64),
	LEFT_UPPER_RIGHT_UPPER_LEFT_BOTTOM_CORNERS_PATH(65);
	
	private final int value;
	
	PostProcessedTileType(final int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}

}
