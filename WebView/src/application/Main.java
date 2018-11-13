package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage myStage) {

		try {

//			FXMLLoader loader = new FXMLLoader(getClass().getResource(
//					"vista.fxml"));
//
//			AnchorPane mypane = loader.load();
			
			AnchorPane mypane = new AnchorPane();

			WebView webView = new WebView();
			WebEngine engine = webView.getEngine();
			// Load a web page
			engine.load("http://www.google.es");
			// Add the web view to the JavaFX view
			mypane.getChildren().add(webView);

			// Inject JavaScript
			// engine.executeScript("history.back()");

			Scene myscene = new Scene(mypane);
			myStage.setScene(myscene);
			myStage.setFullScreen(true);
			myStage.show();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		launch(args);
	}
}
