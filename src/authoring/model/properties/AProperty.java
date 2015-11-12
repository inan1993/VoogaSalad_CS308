package authoring.model.properties;

public abstract class AProperty<T> {

	String myValue;
	public AProperty(String value) {
		this.myValue = value;
	}	
	public abstract T getValue();
	public abstract void setValue(String value);

}
