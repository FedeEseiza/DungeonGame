package DungeonAndLevels;

public abstract class Bonus {
	protected int amount;
	
	public abstract void myFateWithThisLevel(Character player);
	public abstract void consume(Character player);
	
}
