package DESIGN.datafiles;

import java.util.ArrayList;
import java.util.List;

// for example only

public class Level {
	List<Actor> actors;
	public Level() {
		actors = new ArrayList<Actor>();
	}
	public void addActor(Actor actor) {
		actors.add(actor);
	}
}
