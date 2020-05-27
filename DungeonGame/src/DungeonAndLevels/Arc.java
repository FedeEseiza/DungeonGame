package DungeonAndLevels;

public class Arc extends Weapon {
	
	public Arc() {
		this.damage = 3;
	}
	
	public int attack() {
		return this.damage;
	}
	
	public void myFateWithThisLevel(Character player) {
		player.setWeapon(this);;
	}
	
}
