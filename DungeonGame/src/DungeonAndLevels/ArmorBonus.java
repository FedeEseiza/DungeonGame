package DungeonAndLevels;

public class ArmorBonus extends Bonus {
	private int armorBonus;
	
	public ArmorBonus() {
		this.armorBonus = 4;
	}
	public int takeArmorBonus() {
		return armorBonus;
	}
	
	public void myFateWithThisLevel(Character player) {
		player.setArmor(takeArmorBonus());
	}

}
