package DungeonAndLevels;

public abstract class Weapon {
	protected int damage;
	
	public abstract void myFateWithThisLevel(Character player);
	
	public int getDamage() {
		return damage;
	}
}
