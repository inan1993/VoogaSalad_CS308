package data.model;

import java.util.Arrays;
import java.util.List;

import authoring.AbstractLevel;

public class LevelData {
	private List<AbstractLevel> levels;
	private int numberOfLevels;
	
	public LevelData(List<AbstractLevel> levelList) {
		this.levels = levelList;
		updateNumberOfLevels();
	}

	private void updateNumberOfLevels () {
		numberOfLevels = levels.size();
	}
	
	public void add (AbstractLevel... levelList) {
		levels.addAll(Arrays.asList(levelList));
	}
	
	public void remove (AbstractLevel... levelList) {
		levels.removeAll(Arrays.asList(levelList));
	}
	
	public List<AbstractLevel> getLevels () {
		return levels;
	}
}
