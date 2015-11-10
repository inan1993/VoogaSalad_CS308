package DESIGN.datafiles;

public interface Level {
	
	public UpdateObject run();
	public boolean initGraph();
	public boolean addActor(Actor actor);
	public boolean linkActors(TriggerEvent myEvent, Actor... actors);

}
