package DungeonAndLevels;
public class Takeable {
	private String type = "Vacio"; //Tipo de objeto (Equipable (Arma(arrojadizo, de mano), Ropa, Accesorios), Consumible(pociones de curacion, de energia, veneno, potenciadores de velocidad,etc) , Chatarra, Crafteable (elementos, algun tipo de perlas, plantas venenosas)
	
	public Takeable () {}
	public Takeable (String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
}