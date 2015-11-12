package data;

import authoring.model.actors.IActor;

public class LevelSaver extends XMLSaver {
	
	public LevelSaver () {
		super();
	}
	
	public void save (IActor... sList) {
		for (IActor s : sList) {
			this.save(s);
		}
	}
}
