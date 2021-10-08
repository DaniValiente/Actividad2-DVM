package helloPaco;

import java.io.FileInputStream;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Ejercicio4 extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	
	public void start (Stage stage) throws Exception{
		
		
		Scene scene= new Scene(createContent(),300,200);
		stage.setScene(scene);
		stage.setTitle("Ejemplo 4");
		stage.show();
	}
	
	private Parent createContent() throws Exception {
		GridPane root = new GridPane();
		FileInputStream casita = new FileInputStream("Imagenes\\helloPaco\\su.jpg");
		Image imagen = new Image(casita);
		ImageView VerImagen = new ImageView(imagen);
		VerImagen.setFitHeight(100);
		VerImagen.setFitWidth(100);
		Label etiqueta = new Label("SUUUUUUU", VerImagen);
		etiqueta.setFont(Font.font("Times New Roman",20));
		
		root.add(etiqueta,0,0);
		
		
		
		
		return root;
	}
	
	

}
