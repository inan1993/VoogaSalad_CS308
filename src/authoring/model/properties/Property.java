package authoring.model.properties;

import authoring.model.bundles.Identifiable;

public class Property<T> implements Identifiable {

	T myValue;
	String identifier;
	
	public Property(String identifier, T value) {
		this.identifier = identifier;
		this.myValue = value;
	}	
	public T getValue() {
		return myValue;
	}
	public void setValue(T value) {
		myValue = value;
	}
	
	@Override
	public String getUniqueID() {
		return identifier;
	}
}
