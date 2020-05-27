package DungeonAndLevels;

public class Fate {
	private Object[] fates = new Object[20];
	
	public Fate() {
		this.fates[0]="Inicio";
		this.fates[1]=new Orcs();
		this.fates[2]=new LifeBonus() ;
		this.fates[3]=new Sword();
		this.fates[4]=new Arc();
		this.fates[5]=new Reaper();
		this.fates[6]=new Vampire();
		this.fates[7]=new ArmorBonus();
		this.fates[8]=new Giant();
		this.fates[9]=new Sourcerer();
	}
	
	public Object myFate(int pos) {
		return fates[pos];
	}
	
}
