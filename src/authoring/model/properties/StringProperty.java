package authoring.model.properties;

public class StringProperty extends AProperty<String>{

	public StringProperty(String value) {
		super(value);
	}

	@Override
	public String getValue() {
		return this.myValue;
	}

	@Override
	public void setValue(String value) {
		this.myValue = value;
	}

}
