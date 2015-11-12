package view.screen;

import java.util.ArrayList;

import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import view.visual.AbstractVisual;

public abstract class AbstractScreen extends AbstractVisual implements AbstractScreenInterface {
	protected GridPane root;
	protected Scene scene;
	protected int WIDTH;
	protected int HEIGHT;
	protected String title = "";
	protected AbstractScreen nextScreen = null;
	protected ArrayList<GridPane> myPanes;

	abstract public void run();

	abstract protected void makeScene();

	protected void makePanes(int numPanes) {
		myPanes = new ArrayList<GridPane>();
		for (int x = 0; x < numPanes; x++) {
			GridPane pane = new GridPane();
			myPanes.add(pane);
		}
	}

	public Scene getScene() {
		return scene;
	}

	public AbstractScreen getNextScreen() {
		return nextScreen;
	}

	public String getTitle() {
		return title;
	}

	protected void center(GridPane r) {
		r.setAlignment(Pos.CENTER);
		for (Node n : r.getChildren()) {
			if (n instanceof GridPane) {
				center((GridPane) n);
			}
		}
	}

	private void returnToMenu() {
		StartScreen newScreen = new StartScreen();
		nextScreen = newScreen;
	}

	protected void showError(String title, String message) {
		Alert uhoh = new Alert(AlertType.ERROR);
		uhoh.setTitle(title);
		uhoh.setContentText(message);
		uhoh.show();
	}
}
