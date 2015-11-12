package engine.example;

import authoring.GameAuthoringBackend;
import data.XMLManager;
import data.model.GameData;
import engine.GameEngine;
import engine.IEngine;
import exceptions.EngineException;
import exceptions.data.GameFileException;

public class PlayerBackend {
	
	public static void main (String args[]) throws GameFileException{
		
		//	Author the Game and save the levels to a resource.
		GameAuthoringBackend g = new GameAuthoringBackend();
		
		XMLManager xml = new XMLManager();
		
		GameData game = xml.loadGame("authoredLevels");
		
		IEngine engine = new GameEngine(null);
		engine.load(game);
		try {
			engine.play();
		} catch (EngineException e) {
			System.err.println("Error in running the engine");
		}
	}
}
