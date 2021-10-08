package helloPaco;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Ejer2 extends Application {

	public static void main(String[] args) {
	launch(args);
}
	@Override
	public void start (Stage stage) throws Exception{
		Scene scene= new Scene(createContent(),300,300);
		stage.setScene(scene);
		scene.setFill(Color.AQUAMARINE);
		stage.setTitle("Ejemplo 2");
		stage.show();
	}
		private Parent createContent() {
			Group group = new Group();
			Text text = new Text();
			text.setFont(Font.font("Roboto",20));
			text.setText("HOLA");
			Rectangle rectangulo = new Rectangle(250,25,100,140);
			group.getChildren().add(rectangulo);
			group.getChildren().add(text);
			return group;
}
}