package DungeonAndLevels;

public class Character { //ABSTRACT
	private String name;
	private int actualHealth;
	private int maxHealth;
	private int actualEnergy;
	private int maxEnergy;
	private int armor; 			//Max armor 100 whith every Character 
	private String clase; 			//Paladin, Mago, Sourcerer, etc
	private Bag bag;
	private int weight; 			// Peso
	private int levelPosition = 0;
	
	public Character() {
		this("Player Default");
	}
	
	public Character (String name) {
		this.name = name;
		this.maxHealth = 50;
		this.maxEnergy = 25;
		this.actualHealth = 50;
		this.actualEnergy = 25;
		this.armor = 0;
		this.bag = new Bag();
	}
	
	public boolean isAlive() {
		return (actualHealth > 0) ;
	}
	
	public void takeDamage(double damage) {
		if(armor-damage < 0) { 
			/* 
		 Si la armadura no aguanta 
			*/
			actualHealth -= damage - armor;
			armor = 0;
		}else {
			armor -= damage;
		}
	}
	
	public void heal (double amount) {
		this.actualHealth += amount;
		if (this.actualHealth > maxHealth) {
			this.actualHealth = maxHealth;
		}
	}
	
	public int getActualEnergy() {
		return actualEnergy;
	}
	
	public int getActualHealth() {
		return actualHealth;
	}
	
	public int getArmor() {
		return armor;
	}
	
	public String getClase() {
		return clase;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPosition() {
		return levelPosition;
	}
	
	public void movePosition(int steps) {
		this.levelPosition = levelPosition + steps;
	}
	
	@Override
	public String toString() {
		return ("Character { \r\n"+
				"Name:" + this.name +"\r\n" + 
				"actualHealth" + this.actualHealth +"\r\n" +
				"maxHealth" + this.maxHealth +"\r\n" +
				"actualEnergy" + this.actualEnergy +"\r\n" +
				"maxEnergy" + this.maxEnergy +"\r\n" +
				"armor" + this.armor +"\r\n" +
				"clase" + this.clase +"\r\n" +
				"bag" + this.bag.toString() +"\r\n" +
				"weight" + this.weight ) ;
	}
	
}