package com.jdither.app.view;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

/**
 * The {@link PrimaryToolBarView} is the view for the
 * tool bar placed at the top of the application. It provides
 * the interface for saving, adding, removing, selected, and 
 * deselecting images in the Image Manager
 * 
 * @author Stephen Czekalski
 *
 */
public class PrimaryToolBarView extends HBox {

private Button saveAllButton;
	
	private Button saveButton;

	private Button addButton;
	
	private Button removeButton;
	
	private Button selectAllButton;
	 
	private Button clearSelectionButton;
	
	private Button configureOutput;
		
	public PrimaryToolBarView() {
		
		this.saveButton = new Button("Save");
		this.saveAllButton = new Button("Save All");
		this.addButton = new Button("Add");
		this.removeButton = new Button("Remove");
		this.selectAllButton = new Button("Select All");
		this.clearSelectionButton = new Button("Deselect");
		
		this.setSpacing(5);
		
		this.getChildren().add(this.saveButton);
		this.getChildren().add(this.saveAllButton);

		this.getChildren().add(this.addButton);
		this.getChildren().add(this.removeButton);
		
		this.getChildren().add(this.selectAllButton);
		this.getChildren().add(this.clearSelectionButton);
		
	}

	/** @returns {@link Button} */
	public Button getSaveAllButton() {
		return saveAllButton;
	}

	/** @returns {@link Button} */
	public void setSaveAllButton(Button saveAllButton) {
		this.saveAllButton = saveAllButton;
	}

	/** @returns {@link Button} */
	public Button getSaveButton() {
		return saveButton;
	}

	/** @returns {@link Button} */
	public void setSaveButton(Button saveButton) {
		this.saveButton = saveButton;
	}

	/** @returns {@link Button} */
	public Button getAddButton() {
		return addButton;
	}

	/** @returns {@link Button} */
	public void setAddButton(Button addButton) {
		this.addButton = addButton;
	}

	/** @returns {@link Button} */
	public Button getRemoveButton() {
		return removeButton;
	}

	/** @returns {@link Button} */
	public void setRemoveButton(Button removeButton) {
		this.removeButton = removeButton;
	}

	/** @returns {@link Button} */
	public Button getSelectAllButton() {
		return selectAllButton;
	}

	/** @returns {@link Button} */
	public void setSelectAllButton(Button selectAllButton) {
		this.selectAllButton = selectAllButton;
	}

	/** @returns {@link Button} */
	public Button getClearSelectionButton() {
		return clearSelectionButton;
	}

	/** @returns {@link Button} */
	public void setClearSelectionButton(Button clearSelectionButton) {
		this.clearSelectionButton = clearSelectionButton;
	}

}
