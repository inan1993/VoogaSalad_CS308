package DESIGN.datafiles;

import java.util.ArrayList;
import java.util.List;

public class SaveMaster implements IFileManager{
	private GameSaver gameSaver;
	private LevelSaver levelSaver;

	public SaveMaster () {
		this.gameSaver = new GameSaver();
		this.levelSaver = new LevelSaver();
	}

	public static void main (String[] args) {
		GameSaver q = new GameSaver();
		Spaceship s = new Spaceship();
		System.out.println("saving");
		ILevel level = new ILevel();
		level.addActor(s);
		List<ILevel> levelList = new ArrayList<ILevel>();
		levelList.add(level);
		GameData game = new GameData(new StateData(), new LevelData(levelList));
		q.saveGame(game);
		
//		q.save(s);
	}

	@Override
	public void saveGame(GameData game, String fileName) {
		// TODO Auto-generated method stub
	}

	@Override
	public GameData loadGame(String fileName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveState(StateData state, String fileName) {
		// TODO Auto-generated method stub

	}

	@Override
	public StateData loadState(String fileName) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void saveLevel(LevelData level, String fileName) {
		// TODO Auto-generated method stub

	}


	@Override
	public LevelData loadLevel(String fileName) {
		// TODO Auto-generated method stub
		return null;
	}
}
