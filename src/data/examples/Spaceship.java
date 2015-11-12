package data.examples;

import authoring.model.actors.IActor;
import authoring.model.properties.IProperties;
import authoring.model.triggers.selftriggers.ISelfTrigger;
import javafx.scene.paint.Color;

public class Spaceship implements IActor {
	private double myXCor, myYCor;
	private double mySize;
	private Color myColor;
	
	public Spaceship () {
		this.myXCor = 35;
		this.myYCor = 25;
		
		this.mySize = 100;
		this.myColor = Color.RED;
	}
	public Spaceship (double x, double y, double size, Color color) {
		myXCor = x;
		myYCor = y;
		mySize = size;
		myColor = color;
	}
	@Override
	public void addProperty(IProperties property) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void addSelfTrigger(ISelfTrigger trigger) {
		// TODO Auto-generated method stub
		
	}
}
