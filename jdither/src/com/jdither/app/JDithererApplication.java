package com.jdither.app;

import com.jdither.app.controller.ImageManagerController;
import com.jdither.app.model.ImageManagerModel;
import com.jdither.app.view.ImageManagerView;
import com.jdither.app.view.PrimaryToolBarView;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class JDithererApplication extends Application {
	
	private Scene scene;
	
	private BorderPane root;
	
	private ImageManagerModel imageManagerModel;
	
	private PrimaryToolBarView primaryToolBarView;
	
	private ImageManagerView imageManagerView;
	
	private ImageManagerController imageManagerController;
	
	@Override
	public void start(Stage stage) throws Exception {
		try {
			
			// Set up the Stage
			stage.setTitle(ApplicationConstants.APP_NAME + " (" + ApplicationConstants.APP_VERSION + ")");
			stage.setWidth(800);
			stage.setHeight(600);
			stage.setMinWidth(800);
			stage.setMinHeight(600);
			
			// Create the main scene graph and configure
			this.root = new BorderPane();
			this.scene = new Scene(root, 400, 400);
			
			this.imageManagerModel = new ImageManagerModel();
			
			this.primaryToolBarView = new PrimaryToolBarView();
			this.imageManagerView = new ImageManagerView();
			
			this.imageManagerController = new ImageManagerController(stage, imageManagerModel, primaryToolBarView, imageManagerView);
			
			// Configure root BorderPane
			this.root.setTop(this.primaryToolBarView);
			this.root.setCenter(this.imageManagerView);
			
			// Configure the scene
			scene.getStylesheets().add(getClass().getResource("/application.css").toExternalForm());
			stage.setScene(scene);
			
			// Show the stage
			stage.show();
			
			
		} catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
