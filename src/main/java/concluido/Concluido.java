package concluido;

import java.util.List;

import javafx.application.*;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import thiago.agenda.textos;

public class Concluido extends Application{
	List<String> lista;
	

	public Concluido(List<String> lista) {
		this.lista = lista;
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		
		
		
		
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20, 20, 20, 20));
		Label lbl = new Label("Objetivos concluidos: ");
		layout.getChildren().add(lbl);
		int i = 0;
		CheckBox check = null;
		while (i < lista.size()) {
			check = new CheckBox(lista.get(i));
			check.setIndeterminate(false);
			layout.getChildren().add(check);
			i++;
		}
		
		Scene scene = new Scene(layout, 800, 600);
		stage.setScene(scene);
		stage.setTitle(textos.appTitleObjCon);
		stage.setResizable(false);

		stage.show();
	}
}