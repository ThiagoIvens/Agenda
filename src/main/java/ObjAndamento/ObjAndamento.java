package ObjAndamento;

import java.util.List;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import thiago.agenda.textos;

public class ObjAndamento extends Application {
	private List<String> lista;

	public ObjAndamento(List<String> lista) {
		this.lista = lista;
	}

	@Override
	public void start(Stage stage) throws Exception {

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

		Scene scene = new Scene(layout, 800, 600);
		stage.setScene(scene);
		stage.setTitle(textos.appTitleObjAnd);
		stage.setResizable(false);

		stage.show();

	}

}