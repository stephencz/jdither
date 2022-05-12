package com.jdither.app.view;

import com.jdither.app.model.DitheringType;
import com.jdither.app.model.ImageOptions;
import com.jdither.app.model.ResizeType;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class ImageItemView extends GridPane {

	private ImageOptions imageOptions;
	
	private Label imageNameLabel;
	
	private ComboBox<String> formatComboBox;
	
	private ObservableList<String> formatComboBoxOptions;
	
	private Label resizeLabel;
	
	private ComboBox<String> resizeComboBox;
	
	private ObservableList<String> resizeComboBoxOptions;
	
	private TextField resizeWidthTextField;
	
	private TextField resizeHeightTextField;
		
	private Label ditheringTypeLabel;
	
	private ComboBox<String> ditheringComboBox;
	
	private ObservableList<String> ditheringComboBoxOptions;	
	
	private Button previewButton;
	
	public ImageItemView(ImageOptions imageOptions) {
		
		this.imageOptions = imageOptions;
		
		this.getStyleClass().add("image-item-view");
		
		this.imageNameLabel = new Label(this.imageOptions.getFile().getName());
		this.imageNameLabel.setPrefWidth(100);
		
		this.ditheringComboBoxOptions = FXCollections.observableArrayList(DitheringType.getEnumStrings());
		this.ditheringComboBox = new ComboBox<String>(this.ditheringComboBoxOptions);
		
		this.resizeComboBoxOptions = FXCollections.observableArrayList(ResizeType.getEnumStrings());
		this.resizeComboBox = new ComboBox<String>(this.resizeComboBoxOptions);
		
		this.resizeWidthTextField = new TextField();
		this.resizeWidthTextField.setPrefWidth(50);
		this.resizeWidthTextField.setPromptText("Width");
		
		this.resizeHeightTextField = new TextField();
		this.resizeHeightTextField.setPrefWidth(50);
		this.resizeHeightTextField.setPromptText("Height");
		
		this.previewButton = new Button("Preview");
		
		GridPane.setConstraints(this.imageNameLabel, 0, 0);
		GridPane.setConstraints(this.ditheringComboBox, 1, 0);
		GridPane.setConstraints(this.resizeComboBox, 2, 0);
		GridPane.setConstraints(this.resizeWidthTextField, 3, 0);
		GridPane.setConstraints(this.resizeHeightTextField, 4, 0);
		GridPane.setConstraints(this.previewButton, 5, 0);

		this.getChildren().add(this.ditheringComboBox);
		
		this.getChildren().add(this.imageNameLabel);
		this.getChildren().add(this.resizeComboBox);
		this.getChildren().add(this.resizeWidthTextField);
		this.getChildren().add(this.resizeHeightTextField);
		
		this.getChildren().add(this.previewButton);
		
	}
	
}
