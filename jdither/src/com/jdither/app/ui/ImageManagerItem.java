package com.jdither.app.ui;

import java.io.File;

import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class ImageManagerItem extends HBox {

	private File file;
	
	private Label imageNameLabel;
	
	public ImageManagerItem(File file) {
		
		this.file = file;
		this.imageNameLabel = new Label(this.file.getName());
		
		this.getChildren().add(this.imageNameLabel);
	}
	
}
