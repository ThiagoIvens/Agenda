package coisasParaFazer;


import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import thiago.agenda.textos;

public class CoisasFazer extends Application {
	private Button btnCriar;
	private TextField txtNome;
	private TextField txtDiaTermino;
	private TextField txtMesTermino;
	private TextField txtAnoTermino;
	
	@Override
	public void start(Stage stage) throws Exception {
		AnchorPane pane = new AnchorPane();
		pane.setPrefSize(450, 250);
		Scene scene = new Scene(pane);
		stage.setScene(scene);


		Label lblObjetivos = new Label(textos.lblObjetivos);
		lblObjetivos.setLayoutX(10);
		lblObjetivos.setLayoutY(10);

		txtNome = new TextField();
		txtNome.setLayoutX(10);
		txtNome.setLayoutY(31);
		txtNome.setMaxWidth(150);
		txtNome.setMinWidth(150);
		txtNome.setPrefWidth(150);
		

		Label lblObjData = new Label(textos.lblObjData);
		lblObjData.setLayoutX(10);
		lblObjData.setLayoutY(70);
		
		txtDiaTermino = new TextField();
		txtDiaTermino.setLayoutX(10);
		txtDiaTermino.setLayoutY(90);
		txtDiaTermino.setMaxWidth(50);
		txtDiaTermino.setMinWidth(50);
		txtDiaTermino.setPrefWidth(50);
		
		txtMesTermino = new TextField();
		txtMesTermino.setLayoutX(75);
		txtMesTermino.setLayoutY(90);
		txtMesTermino.setMaxWidth(50);
		txtMesTermino.setMinWidth(50);
		txtMesTermino.setPrefWidth(50);
		
		txtAnoTermino = new TextField();
		txtAnoTermino.setLayoutX(140);
		txtAnoTermino.setLayoutY(90);
		txtAnoTermino.setMaxWidth(70);
		txtAnoTermino.setMinWidth(70);
		txtAnoTermino.setPrefWidth(50);
		
		
		btnCriar = new Button(textos.btnCriar);
		btnCriar.setLayoutX(167);
		btnCriar.setLayoutY(30);
		

		
		pane.getChildren().add(lblObjetivos);
		pane.getChildren().add(lblObjData);
		pane.getChildren().add(btnCriar);
		pane.getChildren().add(txtNome);
		pane.getChildren().add(txtDiaTermino);
		pane.getChildren().add(txtMesTermino);
		pane.getChildren().add(txtAnoTermino);
		

		stage.setTitle(textos.appTitleObj);
		stage.setResizable(false);

		stage.show();
	}
	
}
