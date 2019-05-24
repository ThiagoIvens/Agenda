package login;

import javafx.scene.control.TextField;

import com.aquafx_project.AquaFx;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import thiago.agenda.Main;
import thiago.agenda.textos;

public class Login extends Application implements UserPass{
	private Button btnLogin;
	private TextField txtUsername;
	private PasswordField txtPassword;
	private Label lblLogin;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		AnchorPane pane = new AnchorPane();
		pane.setPrefSize(280, 120);
		Scene scene = new Scene(pane);
		stage.setScene(scene);


		lblLogin = new Label(textos.lblLogin);
		lblLogin.setLayoutX(10);
		lblLogin.setLayoutY(10);

		txtUsername = new TextField();
		txtUsername.setLayoutX(10);
		txtUsername.setLayoutY(31);
		txtUsername.setMaxWidth(150);
		txtUsername.setMinWidth(150);
		txtUsername.setPrefWidth(150);
		
		txtPassword = new PasswordField();
		txtPassword.setLayoutX(10);
		txtPassword.setLayoutY(70);
		txtPassword.setMaxWidth(150);
		txtPassword.setMinWidth(150);
		txtPassword.setPrefWidth(150);
		
		btnLogin = new Button(textos.btnLogin);
		btnLogin.setLayoutX(200);
		btnLogin.setLayoutY(40);
		btnLogin.setOnMouseClicked(e -> login(stage));
		
		
		pane.getChildren().add(lblLogin);
		pane.getChildren().add(btnLogin);
		pane.getChildren().add(txtUsername);
		pane.getChildren().add(txtPassword);
		
		
		AquaFx.style();
		AquaFx.styleStage(stage, StageStyle.DECORATED);
		

		stage.setTitle(textos.appTitle);
		stage.setResizable(false);

		stage.show();
	}

	private void login(Stage stage) {
		boolean user = UserPass.User(txtUsername.getText());
		if (txtUsername.getText().isEmpty() || user == false) {
			try {
				new Error(textos.ErrorUser).start(new Stage());
			} catch (Exception e) {
				e.printStackTrace();
			}
			return;
		}		
		
		boolean pass = UserPass.User(txtPassword.getText());
		if (txtPassword.getText().isEmpty() || pass == false) {
			try {
				new Error(textos.ErrorPassword).start(new Stage());
			} catch (Exception e) {
				e.printStackTrace();
			}
			return;
		}

		try {
			new Main(txtUsername.getText()).start(new Stage());
			stage.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
