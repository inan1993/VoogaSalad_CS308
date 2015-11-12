package authoring.model.properties;

import java.util.HashMap;
import java.util.Map;

public abstract class AProperties implements IProperties{

	Map<String, AProperty> properties;
	public AProperties (){
		properties = new HashMap<String, AProperty>();
	}
	
	@Override
	public AProperty getProperty(String propertyName){
		return properties.get(propertyName);
	}
	
	@Override
	public <T> void setProperty(String name, AProperty<T> value){
		properties.put(name, value);
	}
}
