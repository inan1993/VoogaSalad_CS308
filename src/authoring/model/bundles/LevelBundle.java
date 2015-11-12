package authoring.model.bundles;

public class LevelBundle<ILevel> extends AbstractBundle<ILevel> {
	private ILevel currentLevel;
	
	@SafeVarargs
	public LevelBundle (ILevel... levels) {
		super();
		currentLevel = levels[0];
		this.add(levels);
		update(getComponents());
	}
	
	public void setLevel (ILevel newLevel) {
		currentLevel = newLevel;
	}
}
