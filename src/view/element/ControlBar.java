package view.element;

import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ToolBar;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import view.screen.AbstractScreen;
import view.screen.StartScreen;

public class ControlBar extends AbstractElement {

	private AbstractScreen currentScreen;
	private Workspace workspace;
	private double width;

	public ControlBar(GridPane pane, AbstractScreen screen, Workspace workspace, double width) {
		super(pane);
		findResources();
		this.currentScreen = screen;
		this.width = width;
		this.workspace = workspace;
		makePane();
	}

	@Override
	protected void makePane() {
		VBox box = new VBox();
		box.setPrefWidth(width);
		MenuBar mainMenu = new MenuBar();
		makeMenu(mainMenu);
		ToolBar toolBar = new ToolBar();
		makeTools(toolBar);
		box.getChildren().add(mainMenu);
		box.getChildren().add(toolBar);
		pane.add(box, 0, 0);
	}

	private void makeTools(ToolBar toolBar) {
		Button backButton = makeButton("back");
		backButton.setOnAction(e -> currentScreen.setNextScreen(new StartScreen()));
		Button addButton = makeButton("add");
		addButton.setOnAction(e -> workspace.addLevel());
		toolBar.getItems().addAll(backButton, addButton);
	}

	private Button makeButton(String s) {
		Button button = new Button();
		Image img = new Image(getClass().getClassLoader().getResourceAsStream(myResources.getString(s)));
		ImageView image = new ImageView(img);
		image.setFitHeight(Double.parseDouble(myResources.getString("height")));
		image.setPreserveRatio(true);
		image.setSmooth(true);
		image.setCache(true);
		button.setGraphic(image);
		Tooltip tooltip = new Tooltip();
		tooltip.setText(myResources.getString(s + ".message"));
		button.setTooltip(tooltip);
		button.setFocusTraversable(false);
		return button;
	}

	private void makeMenu(MenuBar mainMenu) {
		Menu file = new Menu("File");
		MenuItem load = new MenuItem("Load");
		MenuItem save = new MenuItem("Save");
		file.getItems().addAll(load, save);

		Menu edit = new Menu("Edit");
		MenuItem properties = new MenuItem("Properties");
		edit.getItems().add(properties);

		Menu window = new Menu("Windows");
		MenuItem toolbar = new MenuItem("Toolbar");
		// https://docs.oracle.com/javafx/2/api/javafx/scene/control/CheckMenuItem.html
		window.getItems().add(toolbar);

		Menu help = new Menu("Help");
		MenuItem doc = new MenuItem("Documentation");
		help.getItems().add(doc);

		mainMenu.getMenus().addAll(file, edit, window, help);
	}

}
