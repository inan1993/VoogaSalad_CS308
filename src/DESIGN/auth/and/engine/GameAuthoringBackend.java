package DESIGN.auth.and.engine;

import DESIGN.datafiles.ShootTrigger;
import DESIGN.datafiles.Spaceship;

public class GameAuthoringBackend {

	public static void main (String args[]){

		//	Create the first Level of the game
		ILevel l = new LevelOne();
		l.initGraph();

		/*	Create actors in first level through the Game Authoring GUI.
		 * 	Define all the behaviors and properties of the actors.
		 * 	And them add them to the level.
		 */		
		IActor a = new Spaceship();
		ISelfTrigger e1 = new BreatheEvent();
		IProperty p = new HealthProperty();
		a.addProperty(p);
		a.addSelfTrigger(e1);
		l.addActor(a);

		IActor b = new Spaceship();
		ISelfTrigger e2 = new BreatheEvent();
		b.addSelfTrigger(e2);
		l.addActor(b);
		
		/*	Create Interactions between the actors through the 
		 * 	Game Authoring GUI.
		 * 	Link the actors with the interactions.
		 */
		IExternalTrigger shoot = new ShootTrigger();
		l.linkActorsWithTriggers(shoot, a, b);

		
	}

}
