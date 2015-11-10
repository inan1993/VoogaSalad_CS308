package DESIGN.datafiles;

public class LevelSaver extends XMLSaver {
	
	public LevelSaver () {
		super();
	}
	
	public void save (Serializable... sList) {
		for (Serializable s : sList) {
			this.save(s);
		}
	}
}
