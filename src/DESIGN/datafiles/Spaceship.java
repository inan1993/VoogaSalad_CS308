package DESIGN.datafiles;

import javafx.scene.paint.Color;

public class Spaceship implements Serializable {
	private double xCor, yCor;
	private double size;
	private Color color;
	
	public Spaceship () {
		this.xCor = 35;
		this.yCor = 25;
		
		this.size = 100;
		this.color = Color.RED;
	}
}
