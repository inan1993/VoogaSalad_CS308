package player;

import javafx.scene.Scene;

public interface IPlayer {

	// Resumes gameplay
	public void play();
	
	// Pauses gameplay
	public void pause();
	
	// Draws the player's gui elements
	public void renderGui(Scene s);
}
