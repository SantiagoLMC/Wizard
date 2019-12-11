package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
	/**
	 * crea el Stage
	 */
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("Wizard.fxml"));
		AnchorPane pane = (AnchorPane) loader.load();
		Scene scene = new Scene(pane);
//		scene.getStylesheets().addAll(getClass().getResource("application.css").toExternalForm());
		primaryStage.setTitle("Home page");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}