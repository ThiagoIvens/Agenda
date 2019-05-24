package thiago.agenda;

import ObjAndamento.ObjAndamento;
import calendario.Calender;
import coisasParaFazer.CoisasFazer;
import concluido.Concluido;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {
	private String username;
	private Button btnCalender;
	private Button btnObjetivos;
	private Button btnObjAndamento;
	private Button btnConcluido;
	private CoisasFazer coisasFazer;

	public Main(String username) {
		this.username = username;
	}

	@Override
	public void start(Stage stage) throws Exception {
		AnchorPane pane = new AnchorPane();
		pane.setPrefSize(1024, 720);
		Scene scene = new Scene(pane);
		stage.setScene(scene);

		// labels
		Label lblMain = new Label(textos.lblMain + " " + username);
		lblMain.setLayoutX(10);
		lblMain.setLayoutY(10);

		Label lblescolha = new Label(textos.lblescolha + " ");
		lblescolha.setLayoutX(10);
		lblescolha.setLayoutY(40);

		// buttons
		ButtonBar btnBar = new ButtonBar();
		// btn Calendario
		btnCalender = new Button(textos.btnCalender);

		btnCalender.setOnMouseClicked(e -> {
			try {
				new Calender().start(new Stage());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		coisasFazer = new CoisasFazer();
		// btn Objetivos
		btnObjetivos = new Button(textos.btnObjetivos);

		btnObjetivos.setOnMouseClicked(e -> {
			try {
				coisasFazer.start(new Stage());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});

		// btn Objetivos em Andamento
		btnObjAndamento = new Button(textos.btnObjAndamento);
		btnObjAndamento.setOnMouseClicked(e -> {
			try {
				new ObjAndamento(coisasFazer.getLista()).start(new Stage());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});

		// btn Objetivos Concluidos
		btnConcluido = new Button(textos.btnConcluido);
		btnConcluido.setOnMouseClicked(e -> {
			try {
				new Concluido().start(new Stage());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});

		btnBar.getButtons().addAll(btnCalender, btnObjetivos, btnObjAndamento, btnConcluido);
		btnBar.setLayoutX(10);
		btnBar.setLayoutY(70);

		// pane
		pane.getChildren().add(lblMain);
		pane.getChildren().add(lblescolha);
		pane.getChildren().add(btnBar);

		// stage
		stage.setTitle(textos.appTitle);
		stage.setResizable(false);

		stage.show();

	}

}
