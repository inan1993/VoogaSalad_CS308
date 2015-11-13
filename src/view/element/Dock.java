package view.element;

import java.util.ArrayList;

import javafx.scene.layout.GridPane;

public class Dock extends AbstractElement {

	public Dock(GridPane pane, ArrayList<AbstractDockElement> myElements) {
		super(pane);
		makePane();
	}

	@Override
	protected void makePane() {

	}

}
