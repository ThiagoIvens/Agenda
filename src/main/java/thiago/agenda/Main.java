package thiago.agenda;


import calendario.Calender;


import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class Main extends Application{
	private String username;
	private Button btnCalender;
	private Button btnObjetivos;
	private Button btnObjAndamento;
	private Button btnConcluido;
	
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
	
		//buttons
		ButtonBar btnBar = new ButtonBar();
		//btn Calendario
		btnCalender = new Button(thiago.agenda.textos.btnCalender);
//		btnCalender.setLayoutX(10);
//		btnCalender.setLayoutY(70);
		btnCalender.setOnMouseClicked(e -> {
			try {
				new Calender().start(new Stage());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		//btn Objetivos
		btnObjetivos = new Button(thiago.agenda.textos.btnObjetivos);
//		btnObjetivos.setLayoutX(110);
//		btnObjetivos.setLayoutY(70);
		
		//btn Objetivos em Andamento
		btnObjAndamento = new Button(thiago.agenda.textos.btnObjAndamento);
//		btnObjAndamento.setLayoutX(210);
//		btnObjAndamento.setLayoutY(70);
		
		//btn Concluido
		btnConcluido = new Button(thiago.agenda.textos.btnConcluido);
//		btnConcluido.setLayoutX(410);
//		btnConcluido.setLayoutY(70);
		btnCalender.setOnMouseClicked(e -> {
			try {
				new Calender().start(new Stage());
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
//		pane.getChildren().add(btnCalender);
//		pane.getChildren().add(btnObjetivos);
//		pane.getChildren().add(btnObjAndamento);
//		pane.getChildren().add(btnConcluido);
		pane.getChildren().add(btnBar);
		
		
		//stage
		stage.setTitle(textos.appTitle);
		stage.setResizable(false);

		stage.show();
		
		
	}

}
