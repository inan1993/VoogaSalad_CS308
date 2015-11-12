package engine;

import java.util.List;

import authoring.ILevel;
import data.model.GameData;
import engine.runnable.RunnableGame;
import exceptions.EngineException;

public class GameEngine implements IEngine {

	public RunnableGame runnableGame;
	
	public GameEngine (GameData game) {
		this.runnableGame = new RunnableGame(game);
	}
	
	@Override
	public boolean init(List<ILevel> levelList) {
		return false;
	}

	@Override
	public void reset() {
		runnableGame.reset();
	}

	@Override
	public void load(GameData game) {
		 runnableGame.load(game);
	}

	@Override
	public void play () throws EngineException {
		runnableGame.run();
	}
}
