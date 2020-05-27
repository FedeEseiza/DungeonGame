package DungeonAndLevels;

public abstract class Enemy {
	protected int life;
	protected int armor;
	protected int damage;
	
	public void myFateWithThisLevel(Character player) {
		attack(player);
	}
	
	public void attack(Character player) {
		player.takeDamage(this.damage);
	}
	
}
