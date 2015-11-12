package authoring.model.bundles;

import authoring.AbstractLevel;
import engine.runnable.IRunnable;

public class LevelBundle extends AbstractBundle<String, AbstractLevel> implements IRunnable {
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

	@Override
	public void run() {
		currentLevel.run();
	}
}
