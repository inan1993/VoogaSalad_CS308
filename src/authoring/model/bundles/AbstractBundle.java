package authoring.model.bundles;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Observable;

public abstract class AbstractBundle<K, V> extends Observable implements Iterable<V> {
	private Map<K, V> components;
	
	public AbstractBundle () {
		components = new HashMap<K, V>();
	}
	
	public int getSize () {
		return components.size();
	}
	
	public void add (K key, V value) {
		components.put(key, value);
		update(components);
	}
	
	public void add (Map<K, V> otherComponents) {
		components.putAll(otherComponents);
		update(components);
	}
	
	public void remove (K componentID) {
		components.remove(componentID);
		update(components);
	}
	
	@Override
	public Iterator<V> iterator () {
		return components.values().iterator();
	}
	
	protected void update (Object o) {
		setChanged();
		notifyObservers(o);
	}
	
	protected Map<K, V> getComponents () {
		return components;
	}
}
