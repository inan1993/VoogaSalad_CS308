package controller;

import javafx.stage.Stage;
import view.screen.AbstractScreen;
import view.screen.StartScreen;

public class RootManager {

	private Stage stage;
	private AbstractScreen currentScreen;

	public RootManager(Stage s) {
		stage = s;
		currentScreen = new StartScreen();
		stage.setScene(currentScreen.getScene());
		stage.show();
		stage.setResizable(false);
	}

	public void run() {
		currentScreen.run();
		if (currentScreen.getNextScreen() != null) {
			currentScreen = currentScreen.getNextScreen();
			stage.setScene(currentScreen.getScene());
			stage.setTitle(currentScreen.getTitle());
			stage.show();
		}
	}

}
