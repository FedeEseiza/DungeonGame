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
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		int throwDice;
		System.out.println("Bienvenido a Dungeon And Levels");
		System.out.println("La cantidad de jugadores permitida es 2 o 3");
        System.out.print("Ingrese la cantidad de jugadores: ");
        String read = teclado.nextLine();
		switch (read) 
        {
            case "2": p1 = new Player("Player 1") ;
            		  p2 = new Player("Player 2") ;
            		  dungeon.startDungeonWitPlayers(p1, p2);    		
            		  dungeon.startLevels();
                     break;
            case "3":   p1 = new Player("Player 1") ;
  		  				p2 = new Player("Player 2") ;
  		  			    p3 = new Player("Player 3") ;
  		  			    dungeon.startDungeonWitPlayers(p1, p2, p3);
  		  			    dungeon.startLevels();
                     break;
            default: System.out.println("MAAAL");
            break;         
        }
		System.out.println("Comienza el juego");
		while (dungeon.getActLevel() < 10) {
			
			for (int i= 0; i < dungeon.playerSize();i++) {
				throwDice = (int)(Math.random() * 3) + 1;
				dungeon.getPlayer(i).movePosition(throwDice);
				if (dungeon.getPlayer(i).getPosition() > dungeon.getActLevel()) {
					dungeon.setActLevel(dungeon.getPlayer(i).getPosition());
				}
				if (dungeon.getActLevel() >= 10 ) {
					break;
				}
				System.out.print(dungeon.getLevel(dungeon.getPlayer(i).getPosition()));
				read = teclado.nextLine();
				switch (dungeon.getPlayer(i).getPosition()) 
		        {
		            case 1 : System.out.println("Te ataco un grupo de orcos, pierdes 2 puntos de vida"); 
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
		            case 9 : System.out.println("Sobreviviste felicitaciones"); 
	                     break;
		            case 10 :  
	                     break;     
		        }
				if (i == dungeon.playerSize()) {
					i = 0;
				}
	//			System.out.println(dungeon.getLevel(dungeon.getActLevel()));
	//			System.out.println(dungeon.getPlayer(i).getName());
	//			System.out.println("Estas aca");
	//			read = teclado.nextLine();
				
			}
			
		}
		System.out.println(dungeon.getActLevel());
		
		
	}

}
