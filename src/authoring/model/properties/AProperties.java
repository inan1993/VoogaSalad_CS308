package authoring.model.properties;

import java.util.HashMap;
import java.util.Map;

public abstract class AProperties implements IProperties{

	Map<String, Property> properties;
	
	public AProperties (){
		properties = new HashMap<String, Property>();
	}
	
	@Override
	public Property getProperty(String propertyName){
		return properties.get(propertyName);
	}
	
	@Override
	public <T> void setProperty(Property<T> value){
		properties.put(value.getStringIdentifier(), value);
	}
	
	@Override
	public Map<String, Property> getProperties(){
		return properties;
	}
}
