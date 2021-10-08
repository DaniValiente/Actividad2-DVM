package helloPaco;

import javafx.application.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;

import javafx.scene.control.ToggleButton;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.*;
import javafx.stage.*;
import javafx.scene.*;


public class HelloPaco extends Application {
	
	

	public static void main(String[] args) {
	launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
				Scene scene = new Scene(createContent(),700,700);
				stage.setScene(scene);
				stage.setTitle("Proyecto Nuevo");
				stage.show();	
	}

		
		private Parent createContent() throws Exception{
			
		Pane root = new Pane();
		Button btn = new Button();
		Text text = new Text();
		Text text2 = new Text();
		Text text3 = new Text();
		
		CheckBox boton = new CheckBox();
		ChoiceBox choiceBox = new ChoiceBox<>();
		 choiceBox.getItems().addAll("1","2","3");

		
	     DatePicker data = new DatePicker();
		
	     ToggleButton tog = new ToggleButton();
		 
	     ObservableList<String> names = FXCollections.observableArrayList(
		          "Julia", "Ian","Stephan", "Denise");
		
	     ListView <String> lista = new ListView<String>(names);
	    
		
	     text.setText("Fecha");
		text2.setText("hola");
		btn.setText("SORPRESA");
		
		
		root.setStyle("-fx-background-color:#F1F67C;");
		root.getChildren().addAll(text,text2,data,tog,lista,btn,choiceBox,boton);
		text.relocate(50, 300);
		text2.relocate(50, 400);
		data.relocate(100, 300);
		lista.relocate(500, 60);
		
		

//		root.add(text, 0,1 );
//		root.add(text2, 1, 1);
//		root.add(text, 0, 2);
//		root.add(data, 1, 2);
//		root.add(tog, 0, 6);
//		root.add(lista, 1, 6);
//		root.add(btn, 0, 7);
//		root.add(choiceBox, 1, 7);
//		root.add(boton, 2, 8);
//		
		return root;
		}
		
}
		
		
	
	

		
	

	



