package authoring;

import java.util.ArrayList;

import authoring.model.actors.IActor;
import authoring.model.triggers.externaltriggers.IExternalTrigger;
import authoring.model.triggers.externaltriggers.ShootTrigger;
import authoring.model.triggers.selftriggers.BreatheTrigger;
import authoring.model.triggers.selftriggers.ISelfTrigger;
import data.XMLManager;
import data.examples.Spaceship;
import data.model.LevelData;
import exceptions.data.GameFileException;

public class GameAuthoringBackend {

public static void main (String args[]) throws GameFileException{


		
		//	Create the first Level of the game
		ILevel l = new LevelOne();
		l.initGraph();

		/*	Create actors in first level through the Game Authoring GUI.
		 * 	Define all the behaviors and properties of the actors.
		 * 	And them add them to the level.
		 */		
		IActor a = new Spaceship();
		ISelfTrigger e1 = new BreatheTrigger();
//		IProperties p = new HealthProperty();
//		a.addProperty(p);
		a.addSelfTrigger(e1);
		l.addActor(a);

		IActor b = new Spaceship();
		ISelfTrigger e2 = new BreatheTrigger();
		b.addSelfTrigger(e2);
		l.addActor(b);
		
		/*	Create Interactions between the actors through the 
		 * 	Game Authoring GUI.
		 * 	Link the actors with the interactions.
		 */
		IExternalTrigger shoot = new ShootTrigger();
		l.linkActorsWithTriggers(shoot, a, b);

		//	Create the LevelContainer class	
		@SuppressWarnings("serial")
//		LevelData levelData = new LevelData(new ArrayList<ILevel>() {{add(l);}});
		
		/* 	After Authoring the new Levels they are saved as
		 * 	resources that the player can choose to play on the game engine.
		*/	
		XMLManager xml = new XMLManager();
		xml.saveLevel(levelData, "authoringLevel1");
	}

}
