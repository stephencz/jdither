package com.jdither.app.view;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import com.jdither.app.ui.ImageManagerItem;

import javafx.scene.layout.VBox;

public class ImageManagerView extends VBox {

	private HashMap<String, ImageManagerItem> imageItemMap;
	
	public ImageManagerView() {
		this.imageItemMap = new HashMap<String, ImageManagerItem>();
	}

	public void updateImageManagerItems(HashMap<String, File> imageMap) {
		
		// Create any values which exist in the model, but don't exist in
		// the view.
		for(Entry<String, File> entry : imageMap.entrySet()) {
			if(imageItemMap.isEmpty()) {
				imageItemMap.put(entry.getKey(), new ImageManagerItem(entry.getValue()));
				
			} else {
				if(!this.imageItemMap.containsKey(entry.getKey())) {
					this.imageItemMap.put(entry.getKey(), new ImageManagerItem(entry.getValue()));
				}
			}
		}
		
		
		
		// Clear tree and add image items
		this.getChildren().clear();
		for(ImageManagerItem imageItem : this.imageItemMap.values()) {
			this.getChildren().add(imageItem);
		}
		
	}

}
