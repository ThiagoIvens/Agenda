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
import concluido.*;

public class ObjAndamento extends Application {

	@Override
	public void start(Stage stage) throws Exception {

		ArrayList<String> lista = CoisasFazer.rl();
//		lista.add("thiago");
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20, 20, 20, 20));
		Label lbl = new Label("Objetivos em andamento: ");
		layout.getChildren().add(lbl);
		int i = 0;
		CheckBox check = null;
		while (i < lista.size()) {
			check = new CheckBox(lista.get(i));
			check.setIndeterminate(false);
			layout.getChildren().add(check);
			i++;
		}
		
//#############################################################################################################
		CheckBox cb = check;
		if(cb.isSelected()) {
			Concluido.NewCheckBox(cb);
		}
		
//#############################################################################################################		

		Scene scene = new Scene(layout, 800, 600);
		stage.setScene(scene);
		stage.setTitle(textos.appTitleObjAnd);
		stage.setResizable(false);

		stage.show();

	}

}