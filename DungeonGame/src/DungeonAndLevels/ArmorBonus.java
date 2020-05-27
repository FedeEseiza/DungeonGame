package DungeonAndLevels;

public class ArmorBonus extends Bonus {
	
	public ArmorBonus() {
		this.amount = 4;
	}
	public int getAmount() {
		return amount;
	}
	
	public void myFateWithThisLevel(Character player) {
		this.consume(player);
	}
	
	public void consume(Character player) {
		player.setArmor(amount);
	}

}
