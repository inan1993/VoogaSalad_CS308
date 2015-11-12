package data;

import java.util.List;

import authoring.model.IAction;
import authoring.model.IActor;
import authoring.model.ITriggerEvent;

public interface TemplateGraph {
	
	public List<ITriggerEvent> getEvents(IActor a, IActor b);
	public List<IAction> getActions(IActor a);

}
