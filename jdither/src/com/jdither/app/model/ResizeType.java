package com.jdither.app.model;

import java.util.ArrayList;

public enum ResizeType {

	NONE,
	BILINEAR,
	NEAREST_NEIGHBOR;
	
	public static ArrayList<String> getEnumStrings() {
		ArrayList<String> types = new ArrayList<String>();
		for(ResizeType type : ResizeType.values()) {
			types.add(type.toString());
		}
		
		return types;
	}
	
}
