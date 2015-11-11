package engine;

import authoring.GameAuthoringBackend;
import data.GameData;
import data.GameFileException;
import data.XMLManager;

public class PlayerBackend {
	
	public static void main (String args[]) throws GameFileException{
		
		//	Author the Game and save the levels to a resource.
		GameAuthoringBackend g = new GameAuthoringBackend();
		
		XMLManager xml = new XMLManager();
		
		GameData game = xml.loadGame("authoredLevels");
		
		IEngine engine = new ExampleEngine();
		engine.load(game);
		engine.runGame();
	}
}
