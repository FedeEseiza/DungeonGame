package DungeonAndLevels;

public class Arc extends Weapon {
	private int demage=3;
	
	
	public int attack() {
		return this.damage;
	}
	
	public void myFateWithThisLevel(Character player) {
		player.setWeapon(this);;
	}
}
