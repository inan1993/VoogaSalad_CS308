package view.screen;

import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import view.element.Title;

public class StartScreen extends AbstractScreen {

	private Title t;

	public StartScreen() {
		WIDTH = Integer.parseInt(myResources.getString("width"));
		HEIGHT = Integer.parseInt(myResources.getString("height"));
		root = new GridPane();
		scene = new Scene(root, WIDTH, HEIGHT);
		root.setVgap(Integer.parseInt(myResources.getString("vgap")));
		this.title = myResources.getString("title");
		makeScene();
	}

	@Override
	public void run() {
	}

	@Override
	protected void makeScene() {
		super.makePanes(2);
		t = new Title(myPanes.get(0), title);
		root.add(myPanes.get(0), 0, 0);
		center(root);
	}
}
