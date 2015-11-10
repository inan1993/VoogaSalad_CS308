package DESIGN.auth.and.engine;

import java.util.List;

import DESIGN.datafiles.GameState;
import DESIGN.datafiles.ILevel;

public class ExampleEngine implements IEngine{

	@Override
	public boolean init(List<ILevel> levelList) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean reset() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public GameState save() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean load(GameState state) {
		// TODO Auto-generated method stub
		return false;
	}

}
