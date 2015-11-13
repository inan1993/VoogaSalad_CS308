package authoring.model.triggers.selftriggers;

import authoring.model.actions.IAction;
import authoring.model.bundles.Bundle;
import authoring.model.triggers.ATriggerEvent;

public abstract class ASelfTrigger extends ATriggerEvent {

	protected ASelfTrigger(Bundle<IAction> actions) {
		super(actions);
	}

}
