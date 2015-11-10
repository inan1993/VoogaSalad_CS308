package DESIGN.datafiles;

public interface IFileManager {
	public void saveGame(GameData game, String fileName);
	public GameData loadGame(String fileName);
	
	public void saveState(StateData state, String fileName);
	public StateData loadState(String fileName);
	
	
	
}
