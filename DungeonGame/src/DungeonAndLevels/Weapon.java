package DungeonAndLevels;

public abstract class Weapon {
	protected int damage;
	protected String name;
	
	public abstract void myFateWithThisLevel(Character player);
	
	public int getDamage() {
		return damage;
	}
	
	@Override
	public String toString() {
		return (this.name+"\t Damage: "+this.damage);
	}
	
}
