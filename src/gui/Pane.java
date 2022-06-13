package gui;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class Pane extends StackPane {
	
	MenuBar bar;
	public Pane(){
		bar = new MenuBar();
		Menu menu = new Menu("File");
		MenuItem item = new MenuItem("Open");
		Button btn = new Button("Press");
		Button btn1 = new Button("Lesego");
		
		
		btn.setMinSize(150, 150);
		
		bar.getMenus().add(menu);
		menu.getItems().add(item);
		
		item.setOnAction(e ->{
			
		});
		
		VBox layout = new VBox();
		layout.getChildren().addAll(bar,btn,btn1);
		
		this.getChildren().clear();
		this.getChildren().add(layout);
		
		
	}
	

}
