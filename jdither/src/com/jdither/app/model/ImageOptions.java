package com.jdither.app.model;

import java.io.File;

public class ImageOptions {

	private File file;
			
	private ResizeType resizeType;
	
	private DitheringType ditheringType;
	
	private int ditheringBitSize;
	
	public ImageOptions(File file) {
		this.file = file;
		this.resizeType = ResizeType.NONE;
		this.ditheringType = DitheringType.NONE;
		this.ditheringBitSize = 8;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public ResizeType getResizeType() {
		return resizeType;
	}

	public void setResizeType(ResizeType resizeType) {
		this.resizeType = resizeType;
	}

	public DitheringType getDitheringType() {
		return ditheringType;
	}

	public void setDitheringType(DitheringType ditheringType) {
		this.ditheringType = ditheringType;
	}

	public int getDitheringBitSize() {
		return ditheringBitSize;
	}

	public void setDitheringBitSize(int ditheringBitSize) {
		this.ditheringBitSize = ditheringBitSize;
	}
	
}
