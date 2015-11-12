package data.model;

import java.util.List;

import authoring.AbstractLevel;
import authoring.model.bundles.LevelBundle;

public class GameData {
	private StateData stateData;
	private LevelData levelData;
	
	public GameData (StateData stateData, LevelData levelData) {
		this.stateData = stateData;
		this.levelData = levelData;
	}
	public StateData getStateData() {
		return stateData;
	}
	public LevelData getLevelData() {
		return levelData;
	}
	
	public LevelBundle getRunnableLevels () {
		List<AbstractLevel> myLevels = levelData.getLevels();
		LevelBundle levelBundle = new LevelBundle((AbstractLevel[]) myLevels.toArray());
		return levelBundle;
	}
}
