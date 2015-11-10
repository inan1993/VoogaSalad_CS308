package DESIGN.auth.and.engine;

import java.util.List;

import DESIGN.datafiles.GameState;
import DESIGN.datafiles.ILevel;

public interface IEngine {

	public boolean init(List<ILevel> levelList);
	public boolean reset();
	public GameState save();
	public boolean load(GameState state);
	
}
