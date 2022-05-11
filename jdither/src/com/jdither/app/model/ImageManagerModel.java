package com.jdither.app.model;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * The {@link ImageManagerModel} class represents the data of
 * the image manager aspect of the user interface.
 * 
 * @author Stephen Czekalski
 *
 */
public class ImageManagerModel {

	private ArrayList<File> openImages;
	
	public ImageManagerModel() {
		this.openImages = new ArrayList<File>();
	}
	
	public ArrayList<File> getOpenImages() {
		return this.openImages;
	}
	
	public void setOpenImages(List<File> files) {
		openImages.addAll(files);		
	}
	
	public void pruneOpenImages() {
		for(File imageFile : this.openImages) {
			if(!imageFile.exists()) {
				this.openImages.remove(imageFile);
			}
		}
	}
	
}
