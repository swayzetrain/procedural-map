package com.swayzetrain.utility.proceduralmap.common.enums;

import java.util.HashMap;
import java.util.Map;

public enum Direction {
	LEFT(0),
	RIGHT(1),
	UP(2),
	DOWN(3);
	
	private int value;
	private static final Map<Integer, Direction> BY_VALUE = new HashMap<>();
	
	private Direction(Integer value) {
		this.value = value;
	}
	
	static {
		for (Direction d: values()) {
			BY_VALUE.put(d.value, d);
		}
	}
	
	public static Direction valueOf(Integer direction) {
		return (Direction) BY_VALUE.get(direction);
	}
	
	public Integer getValue() {
		return value;
	}
}
