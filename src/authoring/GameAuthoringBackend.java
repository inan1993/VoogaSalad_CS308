package authoring;

import authoring.model.actions.IAction;
import authoring.model.actions.MoveAction;
import authoring.model.actors.Asteroid;
import authoring.model.bundles.Bundle;
import authoring.model.triggers.selftriggers.ASelfTrigger;
import authoring.model.triggers.selftriggers.TrueTrigger;
import exceptions.data.GameFileException;

public class GameAuthoringBackend {

	public static void main (String args[]) throws GameFileException{

		Asteroid ast = new Asteroid();

		IAction move = new MoveAction(ast);
		Bundle<IAction> bundle = new Bundle<IAction>();
		bundle.add(move);
		ASelfTrigger moveTrigger = new TrueTrigger(bundle);
		
		moveTrigger.condition();
	}

}
