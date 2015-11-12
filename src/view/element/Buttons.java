package view.element;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import view.screen.AbstractScreen;
import view.screen.CreditsScreen;
import view.screen.HelpScreen;
import view.screen.SettingsScreen;

public class Buttons extends AbstractElement {

	private AbstractScreen currentScreen;

	public Buttons(GridPane pane, AbstractScreen screen) {
		super(pane);
		findResources();
		this.currentScreen = screen;
		makePane();
	}

	@Override
	protected void makePane() {
		Button helpButton = makeHelpButton();
		Button settingsButton = makeSettingsButton();
		Button creditsButton = makeCreditsButton();
		pane.add(helpButton, 0, 0);
		pane.add(settingsButton, 1, 0);
		pane.add(creditsButton, 2, 0);
		pane.setHgap(Integer.parseInt(myResources.getString("hgap")));
	}

	protected Button makeSettingsButton() {
		Button button = new Button(myResources.getString("settings"));
		button.setFont(textFont);
		button.setOnMouseClicked(e -> currentScreen.setNextScreen(new SettingsScreen()));
		button.setFocusTraversable(false);
		return button;
	}

	protected Button makeHelpButton() {
		Button button = new Button(myResources.getString("help"));
		button.setFont(textFont);
		button.setOnMouseClicked(e -> currentScreen.setNextScreen(new HelpScreen()));
		button.setFocusTraversable(false);
		return button;
	}

	protected Button makeCreditsButton() {
		Button button = new Button(myResources.getString("credits"));
		button.setFont(textFont);
		button.setOnMouseClicked(e -> currentScreen.setNextScreen(new CreditsScreen()));
		button.setFocusTraversable(false);
		return button;
	}
}
