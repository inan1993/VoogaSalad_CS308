package authoring;

import authoring.model.actors.IActor;
import authoring.model.triggers.ITriggerEvent;

public class LevelOne implements ILevel, Runnable {

	@Override
	public void run() {
	}

	@Override
	public boolean initGraph() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addActor(IActor actor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean linkActorsWithTriggers(ITriggerEvent myEvent, IActor... actors) {
		// TODO Auto-generated method stub
		return false;
	}

}
