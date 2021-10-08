package helloPaco;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Ejer1 extends Application {
 
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start (Stage stage) throws Exception{
		
		Scene scene= new Scene(createContent(),300,300);
		stage.setScene(scene);
		scene.setFill(Color.AQUAMARINE);
		stage.setTitle("Ejemplo 1");
		stage.show();
	}
	
	private Parent createContent() {
		Group group = new Group();
		Line line = new Line();
		line.setStartX(100);
		line.setStartY(200);
		line.setEndX(200);
		line.setEndY(200);
		line.setStrokeWidth(10);
		line.setFill(Color.YELLOW);
//		Rectangle rectangulo = new Rectangle(250,25,100,140);
//		group.getChildren().add(rectangulo);
		group.getChildren().add(line);
		
		return group;
	}
	
	
}
