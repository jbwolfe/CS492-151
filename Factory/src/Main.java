import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		EnemyShipFactory shipFactory = new EnemyShipFactory();
		
		EnemyShip theEnemy = null;
		
		for(int i=0; i<3; i++){
		Scanner userInput = new Scanner(System.in);
		System.out.println("What type of ship (U/R/M)");
		if(userInput.hasNextLine()){
			String typeOfShip = userInput.nextLine();
			theEnemy = shipFactory.makeEnemyShip(typeOfShip);
		}

		doStuffEnemy(theEnemy);
		}
	}
	
	public static void doStuffEnemy(EnemyShip anEnemyShip) {
		anEnemyShip.displayEnemyShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.enemyShipShoots();
	}
}
