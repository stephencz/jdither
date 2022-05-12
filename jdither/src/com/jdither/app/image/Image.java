package com.jdither.app.image;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Image {

	protected File file;
	
	protected FileWriter writer;
	
	protected BufferedImage originalImage;

	protected BufferedImage processedImage;
	
	public Image(String path) {
		this.file = new File(path);
		
		if(this.file.exists()) {
			try {
				this.originalImage = ImageIO.read(file);
			} catch (IOException e) {
				this.originalImage = null;
				e.printStackTrace();
			}
			
		} else {
			this.originalImage = null;
		}
		
		if(this.originalImage != null) {
			
			ColorModel cm = originalImage.getColorModel();
			boolean isAlphaPremulitipled = cm.isAlphaPremultiplied();
			WritableRaster raster = originalImage.copyData(null);

			this.processedImage = new BufferedImage(cm, raster, isAlphaPremulitipled, null);
		
		} else {
			this.processedImage = null;
			
		}
	}
	
	public void applyFloydSteinbergDithering() {
		if(this.processedImage != null) {
			for(int i = 0; i < this.processedImage.getHeight(); i++) {
				for(int j = 0; j < this.processedImage.getWidth(); j++) {
					
					int originalPixel = this.processedImage.getRGB(i, j);
					
					
				}
			}
		}
	}
	
	public void saveImage(String path, String format) {
		File output = new File(path);
		output.mkdirs();
		
		try {
			ImageIO.write(this.processedImage, format, output);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
