package engine;

import java.util.List;

import authoring.ILevel;
import data.GameData;

public interface IEngine {

	public boolean init(List<ILevel> levelList);
	public boolean reset();
	public GameData save();
	public boolean load(GameData state);
	public void runGame();
	
}
