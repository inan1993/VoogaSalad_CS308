package authoring.model.properties;

public interface IProperties {
	public <T> Property<T> getProperty(String peropertyName);
	public <T> void setProperty(Property<T> value);
}
