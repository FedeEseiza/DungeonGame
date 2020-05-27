package DungeonAndLevels;

public abstract class Bonus {
	protected int amount;
	protected String name;
	
	public abstract void myFateWithThisLevel(Character player);
	public abstract void consume(Character player);
	
	@Override
	public String toString() {
		return (this.name+"\t amount: "+this.amount);
	}
	
}
