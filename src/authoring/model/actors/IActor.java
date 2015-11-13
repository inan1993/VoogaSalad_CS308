package authoring.model.actors;

import authoring.model.actions.IAction;
import authoring.model.properties.IProperties;
import authoring.model.triggers.selftriggers.ISelfTrigger;

public interface IActor {
	public IProperties getProperties();
	public ISelfTrigger getSelfTriggers();
	public IAction getActions();
}
