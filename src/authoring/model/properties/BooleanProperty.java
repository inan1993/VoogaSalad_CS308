package authoring.model.properties;

public class BooleanProperty extends AProperty<Boolean>{

	public BooleanProperty(boolean value) {
		super(Boolean.toString(value));
	}

	@Override
	public Boolean getValue() {
		return Boolean.valueOf(this.myValue);
	}

	@Override
	public void setValue(String value) {
		this.myValue = value;
	}

}
