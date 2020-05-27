package DungeonAndLevels;

public abstract class Enemy {
	protected int life;
	protected int armor;
	protected int damage;
	
	public abstract void myFateWithThisLevel(Character player);
	
}
