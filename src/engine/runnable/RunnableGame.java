package engine.runnable;

import authoring.model.bundles.LevelBundle;
import data.model.GameData;

public class RunnableGame implements IRunnable {

	private LevelBundle levelBundle;
	
	public RunnableGame (GameData gameData) {
		load(gameData);
	}
	
	@Override
	public void run () {
		levelBundle.run();
	}
	
	public void reset () {
		
	}
	
	public void load (GameData data) {
		levelBundle = data.getRunnableLevels();
	}

}
