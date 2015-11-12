package engine;

import authoring.model.GameAuthoringBackend;
import data.GameData;
import data.GameFileException;
import data.XMLManager;
import exceptions.EngineException;

public class PlayerBackend {
	
	public static void main (String args[]) throws GameFileException{
		
		//	Author the Game and save the levels to a resource.
		GameAuthoringBackend g = new GameAuthoringBackend();
		
		XMLManager xml = new XMLManager();
		
		GameData game = xml.loadGame("authoredLevels");
		
		IEngine engine = new GameEngine();
		engine.load(game);
		try {
			engine.runGame();
		} catch (EngineException e) {
			System.err.println("Error in running the engine");
		}
	}
}
