package DESIGN.datafiles;

public class LevelSaver extends XMLSaver {
	
	public LevelSaver () {
		super();
	}
	
	public void save (Actor... sList) {
		for (Actor s : sList) {
			this.save(s);
		}
	}
}
