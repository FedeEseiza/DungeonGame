package DungeonAndLevels;

public class Sword extends Weapon {
	
	public Sword() {
		this.name = "Sword";
		this.damage = 6;
	}
	
	public int attack() {
		return this.damage;
	}
	
	public void myFateWithThisLevel(Character player) {
		player.setWeapon(this);;
	}
	
}
