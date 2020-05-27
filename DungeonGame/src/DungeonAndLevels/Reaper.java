package DungeonAndLevels;

public class Reaper {
	private int demage;
	
	public Reaper() {
		this.demage = 6;
	}
	
	public void myFateWithThisLevel(Character player) {
		attack(player);
	}
	
	public void attack(Character player) {
		player.takeDamage(this.demage);
	}
}
