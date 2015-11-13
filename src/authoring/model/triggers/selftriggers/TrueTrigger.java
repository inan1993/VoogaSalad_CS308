package authoring.model.triggers.selftriggers;

import authoring.model.actions.IAction;
import authoring.model.bundles.Bundle;
import authoring.model.triggers.ATriggerEvent;

public class TrueTrigger extends ASelfTrigger {
		
	public TrueTrigger(Bundle<IAction> actions) {
		super(actions);
	}
		
	@Override
	public boolean condition() {
		return performActions();
	}
}
