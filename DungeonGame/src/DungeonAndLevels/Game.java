package DungeonAndLevels;
import java.util.Scanner;
import java.util.Random;
import javax.print.attribute.standard.Finishings;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
//		System.out.println("¡Hola " + read + "!");
		Dungeon dungeon = new Dungeon() ;
		Character p1,p2,p3 ;
		ArmorBonus ar = new ArmorBonus();
		int i= 0;
		System.out.println("Bienvenido a Dungeon And Levels");
		System.out.println("La cantidad de jugadores permitida es 2 o 3");
        System.out.print("Ingrese la cantidad de jugadores: ");
 //       System.out.print(dungeon.throwDice());
        String read = teclado.nextLine();
        p1 = new Character("Player 1") ;
		p2 = new Character("Player 2") ;
		if(read.equals("2")) {
			dungeon.startDungeonWitPlayers(p1, p2);
		}else {
			p3 = new Character("Player 3");
			dungeon.startDungeonWitPlayers(p1, p2, p3);
		}
		
		System.out.println("IMPRECION DE ESTADO ACTUAL DE LOS PLAYERS");
		imprimirEstados(dungeon);
		System.out.println("Comienza el juego");
		while (dungeon.getActLevel() < 10) {  // Mientras que no terminen de jugar cada player
				System.out.println("Preciona enter para tirar los dados");
				read = teclado.nextLine(); 
				dungeon.getPlayer(i).movePosition(throwDice()); //Mueve el player de donde esta mas la posicion que indica el dado
				if (dungeon.getPlayer(i).getPosition() > dungeon.getActLevel()) {
					dungeon.setActLevel(dungeon.getPlayer(i).getPosition());
				}
				if (dungeon.getActLevel() >= 10 ) {
					break;
				}
				System.out.print(dungeon.getPlayer(i).getName()+" ");
				System.out.println(dungeon.historiaDelNivel(dungeon.getPlayer(i).getPosition())); //Cuenta que sucede en la historia
				System.out.println(dungeon.myFate(dungeon.getPlayer(i).getPosition())); //Verifico el objeto que devuelve
				
				
				
			
				if(dungeon.myFate(dungeon.getPlayer(i).getPosition()) instanceof Enemy) {
					((Enemy) (dungeon.myFate(dungeon.getPlayer(i).getPosition()))).myFateWithThisLevel(dungeon.getPlayer(i));
				}else if(dungeon.myFate(dungeon.getPlayer(i).getPosition()) instanceof Bonus) {
					((Bonus) (dungeon.myFate(dungeon.getPlayer(i).getPosition()))).myFateWithThisLevel(dungeon.getPlayer(i));
				}
				
				System.out.println(dungeon.getPlayer(i).estado());
				
				i++;
				if (i == dungeon.playerSize()) { //Se termina la ronda y se reinicia el contador
					i = 0;
				}
	//			System.out.println(dungeon.getLevel(dungeon.getActLevel()));
	//			System.out.println(dungeon.getPlayer(i).getName());
	//			System.out.println("Estas aca");
	//			read = tecla	do.nextLine();
				
			
			
		}
		System.out.println("Felicidades" +" "+dungeon.getPlayer(i).getName()+" "+"Sobreviviste, eres el GANADOR!!!");
		
		
	}
	
	private static void imprimirEstados(Dungeon dungeon) {
		for(int i=0 ; i<dungeon.playerSize() ; i++) {
			System.out.println(dungeon.getPlayer(i).estado());
		}
	}
	
	
	
	private static int throwDice() {
		Random random = new Random();
		return (random.nextInt(3) + 1);
	}

}
