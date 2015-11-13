package authoring.controller;

import controller.AController;
import javafx.stage.Stage;
import view.screen.AbstractScreen;
import view.screen.CreatorScreen;

public class AuthoringController extends AController {

	public AuthoringController (Stage stage) {
		this(stage, new CreatorScreen());
	}
	
	public AuthoringController(Stage stage, AbstractScreen screen) {
		super(stage, screen);
	}
	
	@Override
	public void run() throws Exception {
		currentScreen.run();
	}

}
