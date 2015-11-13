package authoring.model.triggers;

import java.util.Iterator;

import authoring.model.actions.IAction;
import authoring.model.bundles.Bundle;

public abstract class ATriggerEvent implements ITriggerEvent {
	
	private Bundle<IAction> actions;
	
	protected ATriggerEvent(Bundle<IAction> actions) {
		this.actions = actions;
	}

	@Override
	public String getUniqueID() {
		return getClass().getName();
	}

	protected boolean performActions() {
		Iterator<IAction> iterator = actions.iterator();
		while(iterator.hasNext()) {
			iterator.next().run();
		}
		return true;
	}
}
