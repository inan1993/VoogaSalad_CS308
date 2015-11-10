package DESIGN.datafiles;

public class SaveMaster implements IFileManager{
	private GameSaver gameSaver;
	private LevelSaver levelSaver;
	
	public SaveMaster () {
		this.gameSaver = new GameSaver();
		this.levelSaver = new LevelSaver();
	}
	
	public void saveAll (Game game, Level... myLevels) {
		gameSaver.save(game);
		levelSaver.save(myLevels);
	}
	
    public static void main (String[] args) {
    	GameSaver q = new GameSaver();
    	Spaceship s = new Spaceship();
    	
    	q.save(s);
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
}
