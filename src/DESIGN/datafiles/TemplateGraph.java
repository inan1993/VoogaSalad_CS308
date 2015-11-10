package DESIGN.datafiles;

import java.util.List;

public interface TemplateGraph {
	
	public List<TriggerEvent> getEvents(Actor a, Actor b);
	public List<Action> getActions(Actor a);

}
