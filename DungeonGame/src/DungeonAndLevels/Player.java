package DungeonAndLevels;

public class Player {
	private int health = 6;
	private int armor = 4;
	private String name;
	private int levelPosition = 1;
	
	public Player() {
		this.name = "Player default";
	}
	
	public Player(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public int getArmor() {
		return armor;
	}
	
	public int getPosition() {
		return this.levelPosition;
	}
	
	public void takeDamage(int Damage) {
		health = health - Damage;
	}
	
	public String getName() {
		return name;
	}
	
	public void movePosition(int steps) {
		this.levelPosition = levelPosition + steps;
	}
	

}
