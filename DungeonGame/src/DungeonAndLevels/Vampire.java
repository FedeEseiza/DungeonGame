package DungeonAndLevels;

public class Vampire extends Enemy {
	
	public Vampire() {
		this.damage = 2;
	}
	
	public void myFateWithThisLevel(Character player) {
		attack(player);
	}
	
	public void attack(Character player) {
		player.takeDamage(this.damage);
	}
}
