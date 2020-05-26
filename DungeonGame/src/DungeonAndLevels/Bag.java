package DungeonAndLevels;
public class Bag {
	private int totalSlots = 20;
	private int availableSlots = 10;
	private int freeSlots = 10;
	private Takeable[][] bag = new Takeable[4][5];
	
	/*
	AVAILABLE = O
	UNAVAILABLE = *
	O	O	O	O	O
	O	O	O	O	O
	*	*	*	*	*
	*	*	*	*	*
	*/
	public Bag() {
		//instancia objetos de las primeras 2 filas
		for(int i=0 ; i<2 ; i++) {
			for(int j=0 ; j<5 ; j++) {
				bag[i][j] = new Takeable();
			}
		}
	}
	
	public void addSlots(int amount) {
		if(this.availableSlots+amount > this.totalSlots) {
			System.out.println("No se pueden agregar tantos slots. Hay:"+this.availableSlots+" disp. y como maximo Max: "+this.totalSlots);
		}else {
			this.availableSlots += amount;
		}
	}
	
	public void takeObject(Takeable object) {
		if(freeSlots > 0) {
			int i = 0;
			while(i < 4) {
				int j = 0;
				while(j < 5) {
					if(bag[i][j].getType().equals("vacio")) {
						bag[i][j] = object;
						freeSlots --;
						return;
					}
					else {
						j++;
					}
				}
				i++;
			}
		}
	}	
}