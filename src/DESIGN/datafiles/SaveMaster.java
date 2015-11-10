package DESIGN.datafiles;

public class SaveMaster {
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
}
