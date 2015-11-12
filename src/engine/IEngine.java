package engine;

import java.util.List;

import authoring.ILevel;
import data.model.GameData;
import exceptions.EngineException;

/**
 * Basic implementation of the engine is as follows:
 * 
 * Capability to init a game based on a list of levels or a GameData class
 * Capability to run a game --> 
 * 
 * @author Austin
 *
 */

public interface IEngine {

	public boolean init(List<ILevel> levelList);
	
	public boolean reset();
	public GameData save();
	public boolean load(GameData state);
	public void runGame() throws EngineException;
	
}
