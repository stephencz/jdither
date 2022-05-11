package com.jdither.app.model;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import com.jdither.app.view.ImageItemView;

/**
 * The {@link ImageManagerModel} class represents the data of
 * the image manager aspect of the user interface.
 * 
 * @author Stephen Czekalski
 *
 */
public class ImageManagerModel {

	/** A HashMap of {@link File} objects representing the images being used by the application. */
	private HashMap<String, ImageOptions> imageFileMap;
	
	/**
	 * Creates a new {@link ImageManagerModel}.
	 */
	public ImageManagerModel() {
		this.imageFileMap = new HashMap<String, ImageOptions>();
	}
	
	/** @return {@link HashMap} */
	public HashMap<String, ImageOptions> getImageMap() {
		return this.imageFileMap;
	}
	
	/**
	 * Sets images in the image map from a list of files.
	 * @param files A {@link List} of {@link File} objects.
	 */
	public void setImageMap(List<File> files) {
		for(File file : files) {
			if(imageFileMap.isEmpty()) {
				this.imageFileMap.put(file.getName(), new ImageOptions(file));
			
			} else {
			
				if(!this.imageFileMap.containsKey(file.getName())) {
					this.imageFileMap.put(file.getName(), new ImageOptions(file));
					
				}
				
			}
		}
	}
	
	/**
	 * Removes entries from the image map where the file does not
	 * exist.
	 */
	public void pruneImageMap() {
		for(String key : this.imageFileMap.keySet()) {
			if(!this.imageFileMap.get(key).getFile().exists()) {
				this.imageFileMap.remove(key);
			}
		}
	}
	
}
