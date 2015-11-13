package authoring.model.triggers;

import authoring.model.bundles.Identifiable;

public interface ITriggerEvent extends Identifiable {
	    
	public abstract boolean condition();
	
}
