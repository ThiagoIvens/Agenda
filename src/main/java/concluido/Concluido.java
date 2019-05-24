package concluido;

import javafx.application.*;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import thiago.agenda.textos;

public class Concluido extends Application{
	
	
	@Override
	public void start(Stage stage) throws Exception {
		
		
		
		
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20, 20, 20, 20));
		Label lbl = new Label("Objetivos concluidos: ");
		layout.getChildren().add(lbl);
//		layout.getChildren().add(NewCheckBox());
		
		
		Scene scene = new Scene(layout, 800, 600);
		stage.setScene(scene);
		stage.setTitle(textos.appTitleObjCon);
		stage.setResizable(false);

		stage.show();
	}
}