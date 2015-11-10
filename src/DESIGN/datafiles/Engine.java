package DESIGN.datafiles;

import java.util.List;

public interface Engine {

	public boolean init(List<LevelWriteObject> levelList);
	public boolean reset();
	public GameState save();
	public boolean load(GameState state);
	
}
