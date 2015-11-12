package view.element;

import java.util.ArrayList;

import javafx.geometry.Side;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.GridPane;
import view.screen.LevelScreen;

public class Workspace extends AbstractElement {
	private TabPane manager;
	private ArrayList<LevelScreen> levels;
	private LevelScreen currentLevel;

	public Workspace(GridPane pane) {
		super(pane);
		makePane();
	}

	@Override
	protected void makePane() {
		manager = new TabPane();
		levels = new ArrayList<LevelScreen>();
		manager.setSide(Side.TOP);
		pane.add(manager, 0, 0);
	}

	public Tab addLevel() {
		Tab newTab;
		LevelScreen newLevel = new LevelScreen(levels.size());
		newTab = newLevel.getTab();
		int newID = Integer.parseInt(newTab.getId());
		newTab.setOnClosed(e -> removeLevel(newTab));
		manager.getTabs().add(levels.size(), newTab);
		levels.add(newLevel);
		manager.getSelectionModel().select(newID);
		return newTab;
	}

	private void removeLevel(Tab tab) {
		int Id = Integer.parseInt(tab.getId());
		levels.remove(Id);
		resetID(Id);
	}

	private void resetID(int index) {
		for (int i = index; i < levels.size(); i++) {
			levels.get(i).getTab().setId(Integer.toString(i));
			levels.get(i).getTab().setText("Level " + (i + 1));
		}
	}
}
