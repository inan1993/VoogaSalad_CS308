package engine;

import java.util.List;

import authoring.ALevel;
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

	public boolean init(List<ALevel> levelList);
	
	public void reset ();
	public void load(GameData game);
	public void play() throws EngineException;
}
