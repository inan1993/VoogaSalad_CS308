package DESIGN.datafiles;

import java.util.ArrayList;
import java.util.List;

// for example only

public class LevelWriteObject {
	List<Actor> actors;
	public LevelWriteObject() {
		actors = new ArrayList<Actor>();
	}
	public void addActor(Actor actor) {
		actors.add(actor);
	}
}
