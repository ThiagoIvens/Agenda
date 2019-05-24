package ObjAndamento;

import java.util.ArrayList;
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
	private List<String> lista2;

	public ObjAndamento(List<String> lista) {
		this.lista = lista;
	}
	public ObjAndamento() {
		lista2 = new ArrayList<String>();
	}

	@Override
	public void start(Stage stage) throws Exception {

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
			String texto = lista.get(i);
			if(check.isSelected()) {
				Add(texto);
			}
				
			i++;
		}
		
		
		
		Scene scene = new Scene(layout, 800, 600);
		stage.setScene(scene);
		stage.setTitle(textos.appTitleObjAnd);
		stage.setResizable(false);

		stage.show();

	}
	public List<String> getLista2() {
		return lista2;
	}
	public void Add(String texto) {
		lista2.add(texto);
		lista.remove("texto");
	}


}