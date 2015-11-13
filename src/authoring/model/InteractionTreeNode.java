package authoring.model;

import java.util.ArrayList;
import java.util.List;

public class InteractionTreeNode {
	
	private List<InteractionTreeNode> children;
	private String value;
	
	public InteractionTreeNode () {
		this(new ArrayList<InteractionTreeNode>());
	}
	public InteractionTreeNode (List<InteractionTreeNode> children) {
		this.children = children;
	}
	public void addChild (InteractionTreeNode child) {
		children.add(child);
	}
}

// possible alternative
class TriggerNode {
	private List<Actor> actors;
	private List<String> actions;
	private List<Condition> conditions;
	public TriggerNode () {
		actors = new ArrayList<Actor>();
		actions = new ArrayList<String>();
		conditions = new ArrayList<String>();
	}
	public void run () {
		// for each combination of actors:
		for (String condition : conditions) {
			// run scripts
		}
		// if all true:
		for (String action : actions) {
			// run scripts
		}
	}
	private boolean applyGroovy (String script) {
		
	}
}
