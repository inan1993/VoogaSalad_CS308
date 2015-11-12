package authoring.model.actors;

import authoring.model.properties.IProperties;
import authoring.model.triggers.selftriggers.ISelfTrigger;

public interface IActor {
	public void addProperty(IProperties property);
	public void addSelfTrigger(ISelfTrigger trigger);
}
