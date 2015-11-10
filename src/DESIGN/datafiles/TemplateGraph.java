package DESIGN.datafiles;

import java.util.List;

import DESIGN.auth.and.engine.IAction;
import DESIGN.auth.and.engine.IActor;
import DESIGN.auth.and.engine.ITriggerEvent;

public interface TemplateGraph {
	
	public List<ITriggerEvent> getEvents(IActor a, IActor b);
	public List<IAction> getActions(IActor a);

}
