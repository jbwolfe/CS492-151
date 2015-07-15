
public class UFOEnemyShipBuilding extends EnemyShipBuilding {

	protected EnemyShip makeEnemyShip(String typeOfShip) {
		// TODO Auto-generated method stub
		EnemyShip theEnemyShip = null;
		
		if(typeOfShip.equals("UFO")){
			EnemyShipFactory shipPartsFactory = new UFOEnemyShipFactory();
			theEnemyShip = new UFOEnemyShip(shipPartsFactory);
			theEnemyShip.setName("UFO Grunt Ship");
		}
		else if(typeOfShip.equals("UFO MOTHERSHIP")){
			EnemyShipFactory shipPartsFactory = new UFOMothershipFactory();
			theEnemyShip = new UFOMothership(shipPartsFactory);
			theEnemyShip.setName("UFO Mothership");
		}
		
		return theEnemyShip;
	}

}