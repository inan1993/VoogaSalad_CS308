package authoring.model.bundles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;

public abstract class AbstractBundle<T> extends Observable implements Iterable<T> {
	private List<T> components;
	
	public AbstractBundle () {
		components = new ArrayList<T>();
	}
	
	public int getSize () {
		return components.size();
	}
	
	public void add (T component) {
		components.add(component);
		update(components);
	}
	
	@SuppressWarnings("unchecked")
	public void add (T... otherComponents) {
		components.addAll(Arrays.asList(otherComponents));
		update(components);
	}
	
	public boolean remove (T component) {
		boolean hasRemoved = components.remove(component);
		update(components);
		return hasRemoved;
	}
	
	@Override
	public Iterator<T> iterator () {
		return components.iterator();
	}
	
	protected void update (Object o) {
		setChanged();
		notifyObservers(o);
	}
	
	protected List<T> getComponents () {
		return components;
	}
}
