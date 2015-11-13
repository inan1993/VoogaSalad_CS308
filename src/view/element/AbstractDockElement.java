package view.element;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public abstract class AbstractDockElement extends AbstractElement {

	private Stage stage;
	private Label myLabel;

	public AbstractDockElement(GridPane pane, String title) {
		super(pane);
		myLabel = new Label(title);
		myLabel.setFont(headerFont);
		myLabel.setOnMouseClicked(e -> launch());
	}

	private void launch() {
		stage = new Stage();
		stage.setScene(new Scene(pane));
		stage.setTitle(myLabel.getText());
		stage.show();
		stage.setResizable(false);
		stage.setOnCloseRequest(e -> dock());
	}

	private void dock() {

	}

}
