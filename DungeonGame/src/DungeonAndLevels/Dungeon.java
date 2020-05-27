package DungeonAndLevels;
public class Dungeon {
	private String[] levels = new String[20];
	private int actLevel = 1;
	private Character[] player;
	private Fate fates = new Fate(); //Clase que contiene un arreglo con Enemigos o Bonus
	
	public Dungeon() {
		this.startLevels();
	}
	
	public void startDungeonWitPlayers(Character p1,Character p2) { 
		player = new Character[2];
		this.player[0] = p1; 
		this.player[1] = p2; 
	}
	
	public void startDungeonWitPlayers(Character p1,Character p2, Character p3) { 
		player = new Character[3];
		this.player[0] = p1; 
		this.player[1] = p2; 
		this.player[2] = p3; 
	}
	
	public void startLevels() {
		this.levels[0] ="Inicio";
		this.levels[1] = "Te atacó un grupo de orcos, pierdes 2 puntos de vida"; //new Orcs();
		this.levels[2] ="Ganas +2 puntos de vida";
		this.levels[3] ="Encuentras una espada";
		this.levels[4] ="Encuentras un arco";
		this.levels[5] ="Aparece el Reaper, pierdes 5 puntos de vida";
		this.levels[6] ="Aparence un vampiro, te drena 2 puntos de vida";
		this.levels[7] ="Ecuentras una armadura, tu armadura aumenta en +1 ";
		this.levels[8] ="Te enfrentas a un gigante ";
		this.levels[9] ="Te enfrentas a una hechicera";
	}
	
	public void setActLevel(int newLevel) {
		this.actLevel = newLevel;
	}
	
	public int getActLevel() {
		return this.actLevel;
	}
	
	public int playerSize() {
		return player.length;
	}
	
	public Character getPlayer(int i) {
		return this.player[i];
	}
	
	public Object getLevel(int i) {
		return levels[i];
	}
	
	public int throwDice() {
		return (int)(Math.random() * 3) + 1;
	}
	
	public String historiaDelNivel(int i) {
		return (String) this.levels[i];
	}
	
	public Object myFate(int pos) { // Devuelve el destino del jugador ej: Sword, Orcs, Reaper, etc
		return fates.myFate(pos);
	}
	
}
