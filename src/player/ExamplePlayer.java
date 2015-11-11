package player;

import java.util.List;

import DESIGN.Player;
import DESIGN.authoring.ILevel;
import DESIGN.datafiles.GameData;
import DESIGN.datafiles.GameFileException;
import DESIGN.datafiles.IFileManager;
import DESIGN.datafiles.XMLManager;
import DESIGN.engine.ExampleEngine;
import DESIGN.engine.IEngine;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Scene;
import javafx.util.Duration;

public class ExamplePlayer implements Player {
    private static final int FRAMES_PER_SECOND = 60;
    private static final int MILLISECOND_DELAY = 1000 / FRAMES_PER_SECOND;
    private static final double SECOND_DELAY = 1.0 / FRAMES_PER_SECOND;
    
	IEngine myEngine;
	IFileManager myXMLManager;
	Timeline myGameLoop;

	public ExamplePlayer () {
		myEngine = new ExampleEngine();
		myXMLManager = new XMLManager();
		myGameLoop = initLoop(myEngine);
	}

	private Timeline initLoop (IEngine engine) {
		KeyFrame frame = new KeyFrame(Duration.millis(MILLISECOND_DELAY),
				e -> engine.runGame());
		Timeline loop = new Timeline();
		loop.setCycleCount(Timeline.INDEFINITE);
		loop.getKeyFrames().add(frame);
		return loop;
	}


	public GameData selectGame(String fileName) throws GameFileException {
		return myXMLManager.loadGame(fileName);
	}
	
	private void initializeGame (GameData game) {
		List<ILevel> levelList = game.getLevelData().getLevels();
		myEngine.init(levelList);
	}



	@Override
	public void play() {
		// TODO Auto-generated method stub
		myGameLoop.play();
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		myGameLoop.pause();
	}

	@Override
	public void renderGui(Scene s) {
		// TODO Auto-generated method stub

	}

}
