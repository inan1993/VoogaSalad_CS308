package engine;

import java.util.List;

import authoring.model.ILevel;
import data.GameData;
import exceptions.EngineException;

public class GameEngine implements IEngine {

	//TODO: Two options
	// Option 1: Keep GameData
	// Option 2: More loosely couple the components of the GameData into separate components (Currently StateData, LevelData);
	public GameData game;
	
	public GameEngine () {
		this.game = null;
	}
	
	public GameEngine (GameData game) {
		this.game = game;
	}
	
	@Override
	public boolean init(List<ILevel> levelList) {
		return false;
	}

	@Override
	public boolean reset() {
		return false;
	}

	@Override
	public GameData save() {
		return null;
	}

	@Override
	public boolean load(GameData state) {
		
		//TODO: Is this necessary? What is the purpose of having this function return a boolean?
		//Perhaps better would be to throw an exception
		return true;
	}

	@Override
	public void runGame() throws EngineException {
		
	}

}
