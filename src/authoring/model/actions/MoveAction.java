package authoring.model.actions;

import authoring.model.actors.IActor;
import authoring.model.properties.Property;

public class MoveAction implements IAction{

	IActor myActor;
	public MoveAction (IActor a){
		this.myActor = a;
	}
	
	@Override
	public void run() {
		@SuppressWarnings("unchecked")
		Property<Integer> health = (Property<Integer>) myActor.getProperties().getComponents().get("health");
		Integer h = health.getValue();
		health.setValue(++h);
		System.out.println("Health: "+health.getValue());
	}

	@Override
	public String getUniqueID() {
		return getClass().getName();
	}

}
