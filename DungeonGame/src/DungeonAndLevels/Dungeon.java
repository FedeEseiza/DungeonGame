package DungeonAndLevels;
import DungeonAndLevels.Player;
public class Dungeon {
	private Object[] levels = new Object[20];
	private int actLevel = 1;
	private Player[] player;
	
	public void startDungeonWitPlayers(Player p1,Player p2) {
		player = new Player[2];
		this.player[0] = p1; 
		this.player[1] = p2; 
	}
	
	public void startDungeonWitPlayers(Player p1,Player p2, Player p3) {
		player = new Player[3];
		this.player[0] = p1; 
		this.player[1] = p2; 
		this.player[2] = p3; 
	}
	
	public void startLevels() {
		this.levels[0] ="Inicio";
		this.levels[1] = new Orcs();
		this.levels[2] ="Ganas +2 puntos de vida";
		this.levels[3] ="Encuentras una espada";
		this.levels[4] ="Encuentras un arco";
		this.levels[5] ="Aparece el Reaper, pierdes 5 puntos de vida";
		this.levels[6] ="Aparence un vampiro, te drena 2 puntos de vida";
		this.levels[7] ="Ecuentras una armadura, tu armadura aumenta en +1 ";
		this.levels[8] ="Te enfrentas a un gigante ";
		this.levels[9] ="Sobreviviste felicitaciones";
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
	
	public Player getPlayer(int i) {
		return this.player[i];
	}
	
	public Object getLevel(int i) {
		return levels[i];
	}
	
	public int throwDice() {
		return (int)(Math.random() * 3) + 1;
	}
	
	
}
