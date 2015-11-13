package view.screen;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import view.element.ControlBarCreatorScene;
import view.element.Workspace;

public class CreatorScreen extends AbstractScreen {

	private ControlBarCreatorScene t;
	private Workspace w;
	

	public CreatorScreen() {
		findResources();
		WIDTH = Integer.parseInt(myResources.getString("width"));
		HEIGHT = Integer.parseInt(myResources.getString("height"));
		makeScene();
		scene = new Scene(root, WIDTH, HEIGHT);
		root.prefHeightProperty().bind(scene.heightProperty());
		root.prefWidthProperty().bind(scene.widthProperty());
		this.title = myResources.getString("title");
		System.out.println(root.widthProperty());
	}

	@Override
	public void run() {

	}

	@Override
	protected void makeScene() {
		BorderPane r = new BorderPane();
		makePanes(2);
		w = new Workspace(myPanes.get(1));
		t = new ControlBarCreatorScene(myPanes.get(0), this, w, WIDTH);
		r.setTop(myPanes.get(0));
		r.setCenter(myPanes.get(1));
		root = r;
	}

}
