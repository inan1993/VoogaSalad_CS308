package DESIGN.datafiles;

import java.util.ArrayList;
import java.util.List;

import DESIGN.auth.and.engine.IActor;

// for example only

public class ILevel {
	List<IActor> actors;
	public ILevel() {
		actors = new ArrayList<IActor>();
	}
	public void addActor(IActor actor) {
		actors.add(actor);
	}
}
