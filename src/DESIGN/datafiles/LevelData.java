package DESIGN.datafiles;

import java.util.Arrays;
import java.util.List;

public class LevelData {
	private List<LevelWriteObject> levels;
	private int numberOfLevels;
	
	public LevelData (List<LevelWriteObject> levels) {
		this.levels = levels;
		updateNumberOfLevels();
	}
	
	private void updateNumberOfLevels () {
		numberOfLevels = levels.size();
	}
	
	public void add (LevelWriteObject... levelList) {
		levels.addAll(Arrays.asList(levelList));
	}
	
	public void remove (LevelWriteObject... levelList) {
		levels.removeAll(Arrays.asList(levelList));
	}
}
