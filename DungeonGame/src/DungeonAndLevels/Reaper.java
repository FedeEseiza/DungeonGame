package DungeonAndLevels;

public class Reaper extends Enemy {
	
	public Reaper() {
		this.damage = 5;
	}
	
	public void myFateWithThisLevel(Character player) {
		attack(player);
	}
	
	public void attack(Character player) {
		player.takeDamage(this.damage);
	}
}
