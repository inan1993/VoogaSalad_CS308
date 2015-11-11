package data;

import java.util.List;

import authoring.IAction;
import authoring.IActor;
import authoring.ITriggerEvent;

public interface TemplateGraph {
	
	public List<ITriggerEvent> getEvents(IActor a, IActor b);
	public List<IAction> getActions(IActor a);

}
