package view.screen;

import javafx.scene.control.Tab;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import view.element.AbstractElement;

public class LevelMap extends AbstractElement {
	private Tab myTab;
	private Rectangle map;

	public LevelMap(GridPane pane, int i) {
		super(pane);
		findResources();
		myTab = new Tab("Level " + (i + 1));
		myTab.setContent(pane);
		myTab.setId(Integer.toString(i));
		makePane();
	}

	public Tab getTab() {
		return myTab;
	}

	@Override
	protected void makePane() {
		map = new Rectangle(Double.parseDouble(myResources.getString("width")),
				Double.parseDouble(myResources.getString("height")));
		map.setFill(Color.valueOf(myResources.getString("background")));
		pane.add(map, 0, 0);
	}

	public Rectangle getMap() {
		return map;
	}

}
