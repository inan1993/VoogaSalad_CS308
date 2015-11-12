package authoring.model.properties;

public class NumberProperty extends AProperty<Double>{

	public NumberProperty(Double value) {
		super(Double.toString(value));
	}

	@Override
	public Double getValue() {
		return Double.valueOf(this.myValue);
	}

	@Override
	public void setValue(String value) {
		this.myValue = value;
	}

}
