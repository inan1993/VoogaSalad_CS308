package DESIGN.datafiles;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;

public class LevelData {
	private List<Level> levels;
	private int numberOfLevels;
	
	public LevelData (List<Level> levels) {
		this.levels = levels;
		updateNumberOfLevels();
	}
	
	private void updateNumberOfLevels () {
		numberOfLevels = levels.size();
	}
	
	public void add (Level... levelList) {
		levels.addAll(Arrays.asList(levelList));
	}
	
	public void remove (Level... levelList) {
		levels.removeAll(Arrays.asList(levelList));
	}
}
