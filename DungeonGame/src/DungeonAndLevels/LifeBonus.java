package DungeonAndLevels;

public class LifeBonus extends Bonus {
	private double lifeBonus;
	public LifeBonus() {
		this.lifeBonus = 2;
	}
	public double takeLifeBonus() {
		return lifeBonus;
	}
	
	public void myFateWithThisLevel(Character player) {
		player.heal(takeLifeBonus());
	}
}
