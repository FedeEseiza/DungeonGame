package DungeonAndLevels;

public class Player {
	private int life = 6;
	private int armor = 4;
	private String name;
	private int levelPosition = 1;
	
	public Player() {
		this.name = "Player default";
	}
	
	public Player(String name) {
		this.name = name;
	}
	public int getLife() {
		return life;
	}
	public int getArmor() {
		return armor;
	}
	
	public int getPosition() {
		return this.levelPosition;
	}
	
	public void takeLife(int atack) {
		life = life - atack;
	}
	
	public String getName() {
		return name;
	}
	
	public void movePosition(int steps) {
		this.levelPosition = levelPosition + steps;
	}
	

}
