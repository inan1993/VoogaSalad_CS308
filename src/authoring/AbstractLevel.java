package authoring;

import authoring.model.actors.IActor;
import authoring.model.bundles.Identifiable;
import authoring.model.triggers.ITriggerEvent;

public abstract class AbstractLevel implements ILevel, Identifiable {

	@Override
	public String getUniqueID() {
		return null;
	}

	@Override
	public boolean initGraph() {
		return false;
	}

	@Override
	public boolean addActor(IActor actor) {
		return false;
	}

	@Override
	public boolean linkActorsWithTriggers(ITriggerEvent myEvent, IActor... actors) {
		return false;
	}

}
