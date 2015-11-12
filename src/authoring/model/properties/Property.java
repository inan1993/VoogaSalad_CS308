package authoring.model.properties;

public class Property<T> {

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
	public String getStringIdentifier() {
		return identifier;
	}
}
