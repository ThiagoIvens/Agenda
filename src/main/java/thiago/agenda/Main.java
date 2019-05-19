package thiago.agenda;

import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class Main extends Application{
	private String username;
	
	public Main(String username) {
		this.username = username;
	}

	@Override
	public void start(Stage stage) throws Exception {
		AnchorPane pane = new AnchorPane();
		pane.setPrefSize(640, 480);
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		
		Label lblMain = new Label(textos.lblMain + " " + username);
		lblMain.setLayoutX(10);
		lblMain.setLayoutY(10);
		
		pane.getChildren().add(lblMain);

		stage.setTitle(textos.appTitle);
		stage.setResizable(false);

		stage.show();
	}

}
