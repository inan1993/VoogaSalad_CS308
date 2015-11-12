package authoring.model.properties;

import java.util.Map;

public interface IProperties {
	public <T> Property<T> getProperty(String peropertyName);
	public <T> void setProperty(Property<T> value);
	public Map<String, Property> getProperties();
}
