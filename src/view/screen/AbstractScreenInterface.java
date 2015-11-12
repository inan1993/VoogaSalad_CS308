package view.screen;

import javafx.scene.Scene;

public interface AbstractScreenInterface {

	abstract public void run();

	public Scene getScene();

	public AbstractScreen getNextScreen();

	public String getTitle();
	
}