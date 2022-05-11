package com.jdither.app.view;

import java.io.File;

import com.jdither.app.model.DitheringType;
import com.jdither.app.model.ImageOptions;
import com.jdither.app.model.ResizeType;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class ImageItemView extends HBox {

	private ImageOptions imageOptions;
	
	private Label imageNameLabel;
	
	private Label resizeLabel;
	
	private ComboBox<String> resizeComboBox;
	
	private ObservableList<String> resizeComboBoxOptions;
	
	private TextField resizeWidthTextField;
	
	private TextField resizeHeightTextField;
	
	private Label ditheringLabel;
	
	private ComboBox<String> ditheringComboBox;
	
	private ObservableList<String> ditheringComboBoxOptions;	
	
	private Button previewButton;
	
	public ImageItemView(ImageOptions imageOptions) {
		
		this.imageOptions = imageOptions;
		
		this.imageNameLabel = new Label(this.imageOptions.getFile().getName());
		
		this.resizeLabel = new Label("Resize: ");
		this.resizeComboBoxOptions = FXCollections.observableArrayList(ResizeType.getEnumStrings());
		this.resizeComboBox = new ComboBox<String>(this.resizeComboBoxOptions);
		this.resizeComboBox.getSelectionModel().selectFirst();
		
		this.resizeWidthTextField = new TextField();
		this.resizeWidthTextField.setPrefWidth(80);
		
		this.resizeHeightTextField = new TextField();
		this.resizeHeightTextField.setPrefWidth(80);

		
		this.ditheringLabel = new Label("Dithering: ");
		this.ditheringComboBoxOptions = FXCollections.observableArrayList(DitheringType.getEnumStrings());
		this.ditheringComboBox = new ComboBox<String>(this.ditheringComboBoxOptions);
		this.ditheringComboBox.getSelectionModel().selectFirst();
		
		this.previewButton = new Button("Preview");
		
		this.getChildren().add(this.imageNameLabel);
		this.getChildren().add(this.resizeLabel);
		this.getChildren().add(this.resizeComboBox);
		this.getChildren().add(this.resizeWidthTextField);
		this.getChildren().add(this.resizeHeightTextField);
		
		this.getChildren().add(this.ditheringLabel);
		this.getChildren().add(this.ditheringComboBox);
		
		this.getChildren().add(this.previewButton);
	}
	
}
