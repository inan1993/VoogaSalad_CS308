package view.screen;

import javafx.scene.control.Tab;

public class LevelScreen extends CreatorScreen {
	private Tab myTab;

	public LevelScreen(int i) {
		super();
		myTab = new Tab("Level " + (i + 1));
		myTab.setContent(root);
		myTab.setId(Integer.toString(i));
	}

	public Tab getTab() {
		return myTab;
	}

}
