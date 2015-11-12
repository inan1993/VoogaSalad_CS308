package data;

import java.util.List;

import authoring.model.actions.IAction;
import authoring.model.actors.IActor;
import authoring.model.triggers.ITriggerEvent;

public interface TemplateGraph {
	
	public List<ITriggerEvent> getEvents(IActor a, IActor b);
	public List<IAction> getActions(IActor a);

}
