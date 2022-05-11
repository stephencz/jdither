package com.jdither.app.model;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * The {@link ImageManagerModel} class represents the data of
 * the image manager aspect of the user interface.
 * 
 * @author Stephen Czekalski
 *
 */
public class ImageManagerModel {

	/** A HashMap of File objects representing the images being used by the application. */
	private HashMap<String, File> imageMap;
	
	/**
	 * Creates a new {@link ImageManagerModel}.
	 */
	public ImageManagerModel() {
		this.imageMap = new HashMap<String, File>();
	}
	
	/** @return {@link HashMap} */
	public HashMap<String, File> getImageMap() {
		return this.imageMap;
	}
	
	/**
	 * Sets images in the image map from a list of files.
	 * @param files A {@link List} of {@link File} objects.
	 */
	public void setImageMap(List<File> files) {
		for(File file : files) {
			if(imageMap.isEmpty()) {
				this.imageMap.put(file.getName(), file);
			
			} else {
			
				if(!this.imageMap.containsKey(file.getName())) {
					this.imageMap.put(file.getName(), file);
					
				}
				
			}
		}
	}
	
	/**
	 * Removes entries from the image map where the file does not
	 * exist.
	 */
	public void pruneImageMap() {
		for(String key : this.imageMap.keySet()) {
			if(!this.imageMap.get(key).exists()) {
				this.imageMap.remove(key);
			}
		}
	}
	
	
}
