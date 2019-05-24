package coisasParaFazer;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import thiago.agenda.textos;

public class CoisasFazer extends Application {
	private Button btnCriar;
	private TextField txtNome;

	private ArrayList<String> lista;

	public CoisasFazer() {
		lista = new ArrayList<String>();
	}

	@Override
	public void start(Stage stage) throws Exception {
		Label lblObjetivos = new Label(textos.lblObjetivos);
		
		txtNome = new TextField();
		
		btnCriar = new Button(textos.btnCriar);
		btnCriar.setOnMouseClicked(e -> btnCriar());
		
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20, 20, 20, 20));
		layout.getChildren().addAll(lblObjetivos, txtNome, btnCriar);

		Scene scene = new Scene(layout, 800, 600);
		stage.setScene(scene);
		stage.setTitle(textos.appTitleObj);
		stage.setResizable(false);

		stage.show();
	}

	public ArrayList<String> getLista() {
		return lista;
	}

	public void btnCriar() {
		lista.add(txtNome.getText());
		txtNome.clear();
	}
}
