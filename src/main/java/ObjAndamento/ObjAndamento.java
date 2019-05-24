package ObjAndamento;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import thiago.agenda.textos;

import java.util.ArrayList;

import coisasParaFazer.CoisasFazer;

public class ObjAndamento extends Application {

	@Override
	public void start(Stage stage) throws Exception {

		ArrayList<String> lista = CoisasFazer.rl();
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20, 20, 20, 20));
		
		lista.add("thiago");
		Label lbl = new Label("Em Andamento: ");
		layout.getChildren().add(lbl);
		int i = 0;
		String item = null;
		while (i <= lista.size()) {
			item = lista.get(i);
			CheckBox check = new CheckBox(item);
			check.setIndeterminate(false);
			layout.getChildren().add(check);
			i++;
		}
		

		Scene scene = new Scene(layout, 800, 600);
		stage.setScene(scene);
		stage.setTitle(textos.appTitleObjAnd);
		stage.setResizable(false);

		stage.show();

	}

}