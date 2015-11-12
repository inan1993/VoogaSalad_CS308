package view.screen;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import view.element.ControlBar;

public class CreatorScreen extends AbstractScreen {

	ControlBar t;

	public CreatorScreen() {
		findResources();
		WIDTH = Integer.parseInt(myResources.getString("width"));
		HEIGHT = Integer.parseInt(myResources.getString("height"));
		makeScene();
		scene = new Scene(root, WIDTH, HEIGHT);
		this.title = myResources.getString("title");

	}

	@Override
	public void run() {

	}

	@Override
	protected void makeScene() {
		BorderPane r = new BorderPane();
		makePanes(2);
		t = new ControlBar(myPanes.get(0), this, WIDTH);
		r.setTop(myPanes.get(0));
		root = r;
	}

}
