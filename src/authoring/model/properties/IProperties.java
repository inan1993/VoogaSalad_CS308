package authoring.model.properties;

public interface IProperties {
	public <T> AProperty<T> getProperty(String peropertyName);
	public <T> void setProperty(String name, AProperty<T> value);
}
