package DungeonAndLevels;
import 	DungeonAndLevels.Dungeon;
import java.util.Scanner;

import javax.print.attribute.standard.Finishings;

import DungeonAndLevels.Player;
public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
//		System.out.println("¡Hola " + read + "!");
		Dungeon dungeon = new Dungeon() ;
		Player p1,p2,p3 ;
		int throwDice;
		int i= 0;
		System.out.println("Bienvenido a Dungeon And Levels");
		System.out.println("La cantidad de jugadores permitida es 2 o 3");
        System.out.print("Ingrese la cantidad de jugadores: ");
 //       System.out.print(dungeon.throwDice());
        String read = teclado.nextLine();
        p1 = new Player("Player 1") ;
		p2 = new Player("Player 2") ;
		if(read == "2") {
			dungeon.startDungeonWitPlayers(p1, p2);
		}else {
			p3 = new Player("Player 3");
			dungeon.startDungeonWitPlayers(p1, p2, p3);
		}
		dungeon.startLevels();
		System.out.println("Comienza el juego");
		while (dungeon.getActLevel() < 10) {  // Mientras que no terminen de jugar cada player
				System.out.println("Preciona enter para tirar los dados");
				read = teclado.nextLine();
				throwDice = (int)(Math.random() * 3) + 1; //Tira el dado 
				dungeon.getPlayer(i).movePosition(throwDice); //Mueve el player de donde esta mas la posicion que indica el dado
				if (dungeon.getPlayer(i).getPosition() > dungeon.getActLevel()) {
					dungeon.setActLevel(dungeon.getPlayer(i).getPosition());
				}
				if (dungeon.getActLevel() >= 10 ) {
					break;
				}
				System.out.print(dungeon.getPlayer(i).getName()+" ");
				switch (dungeon.getPlayer(i).getPosition()) 
		        {
		            case 1 : 
		            		System.out.println("Te ataco un grupo de orcos, pierdes 2 puntos de vida"); 
		            		break;
		            case 2 : System.out.println("Ganas dos puntos de vida");  
		                     break;
		            case 3 : System.out.println("Encuentras una espada"); 
	                     break;
		            case 4 : System.out.println("Encuentras un arco");  
	                     break;         
		            case 5 : System.out.println("Aparece el Reaper, pierdes 5 puntos de vida"); 
	                     break;
		            case 6 : System.out.println("Aparence un vampiro, te drena 2 puntos de vida");  
	                     break;
		            case 7 : System.out.println("Ecuentras una armadura, tu armadura aumenta en +1 "); 
	                     break;
		            case 8 : System.out.println("Te enfrentas a un gigante ");  
	                     break;
		            case 9 : System.out.println("Te enfrentas a una echicera ");
	                     break;
		            case 10 :  
	                     break;     
		        }
				i++;
				if (i == dungeon.playerSize()) { //Se termina la ronda y se reinicia el contador
					i = 0;
				}
	//			System.out.println(dungeon.getLevel(dungeon.getActLevel()));
	//			System.out.println(dungeon.getPlayer(i).getName());
	//			System.out.println("Estas aca");
	//			read = teclado.nextLine();
				
			
			
		}
		System.out.println("Felicidades" +" "+dungeon.getPlayer(i).getName()+" "+"Sobreviviste, eres el GANADOR!!!");
		
		
	}

}
