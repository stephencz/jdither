package com.jdither.app.model;

import java.util.ArrayList;

public enum DitheringType {

	NONE,
	FLOYD_STEINBERG;

	public static ArrayList<String> getEnumStrings() {
		ArrayList<String> types = new ArrayList<String>();
		for(DitheringType type : DitheringType.values()) {
			types.add(type.toString());
		}
		
		return types;
	}
	
}
