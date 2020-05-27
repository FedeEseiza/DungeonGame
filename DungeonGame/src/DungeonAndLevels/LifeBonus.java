package DungeonAndLevels;

public class LifeBonus extends Bonus {

	public LifeBonus() {
		this.amount = 2;
	}
	public double takeLifeBonus() {
		return amount;
	}
	
	public void myFateWithThisLevel(Character player) {
		this.consume(player);
	}
	
	public void consume(Character player) {
		player.heal(takeLifeBonus());
		
	}
}
