package DungeonAndLevels;

public abstract class Enemy {
	protected String name;
	protected int life;
	protected int armor;
	protected int damage;
	
	public void myFateWithThisLevel(Character player) {
		attack(player);
	}
	
	public void attack(Character player) {
		player.takeDamage(this.damage);
	}
	
	@Override
	public String toString() {
		return (this.name+"\t damage: "+this.damage);
	}
	
}
