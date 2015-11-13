package authoring.model.actions;

import authoring.model.bundles.Identifiable;

public interface IAction extends Identifiable {
	public void run();
}
