package authoring.model.bundles;

import authoring.AbstractLevel;

public class LevelBundle extends AbstractBundle<String, AbstractLevel> {
	private AbstractLevel currentLevel;
	
	public LevelBundle (AbstractLevel... levels) {
		super();
		
		for (AbstractLevel level : levels) {
			add(level.getUniqueID(), level);
		}
		
		currentLevel = levels[0];
		update(getComponents());
	}
	
	public void setLevel (AbstractLevel newLevel) {
		currentLevel = newLevel;
	}
}
