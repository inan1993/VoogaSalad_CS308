package data.model;

import java.util.List;

import authoring.AbstractLevel;
import authoring.model.bundles.Bundle;

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
	
	public Bundle getRunnableLevels () {
		List<AbstractLevel> myLevels = levelData.getLevels();
		return null;
	}
}
