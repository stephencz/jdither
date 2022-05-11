package com.jdither.app.controller;

import java.io.File;
import java.util.List;

import com.jdither.app.model.ImageManagerModel;
import com.jdither.app.view.ImageManagerView;
import com.jdither.app.view.PrimaryToolBarView;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class ImageManagerController {

	private final Stage stage;
	
	private ImageManagerModel model;
	
	private PrimaryToolBarView toolBarView;
	
	private ImageManagerView imageManagerView;
		
	public ImageManagerController(final Stage stage, ImageManagerModel model, PrimaryToolBarView toolBarView, ImageManagerView imageManagerView) {
		this.stage = stage;
		
		this.model = model;
		this.toolBarView = toolBarView;
		this.imageManagerView = imageManagerView;
		
		this.addAddImageButtonPressedEvent();
		
	}

	private void addAddImageButtonPressedEvent() {
		this.toolBarView.getAddButton().setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				FileChooser fileChooser = new FileChooser();
				fileChooser.setTitle("Open Image/Images");
				List<File> files = fileChooser.showOpenMultipleDialog(stage);
				
			}
			
		});
	}
	
	
	public ImageManagerModel getModel() {
		return model;
	}

	public PrimaryToolBarView getToolBarView() {
		return toolBarView;
	}

	public ImageManagerView getImageManagerView() {
		return imageManagerView;
	}
}