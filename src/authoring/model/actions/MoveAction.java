package authoring.model.actions;

import authoring.model.actors.IActor;

public class MoveAction implements IAction{

	IActor myActor;
	public MoveAction (IActor a){
		this.myActor = a;
	}
	
	@Override
	public void run() {
//		a.getProperties()
	}

}
