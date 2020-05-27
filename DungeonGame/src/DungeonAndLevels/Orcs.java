package DungeonAndLevels;

public class Orcs extends Enemy {
	private double damage;
 
	public Orcs() {
		this.damage = 4;
		this.life = 8;
		this.armor = 0;
	}
	
	public void myFateWithThisLevel(Character player) {
		attack(player);
	}
	
	public void attack(Character player) {
		player.takeDamage(this.damage);
	}
}
