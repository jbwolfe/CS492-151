
public class EnemyShipFactory {
	
	public EnemyShip makeEnemyShip(String newShipType) {
		EnemyShip newShip = null;
		
		if(newShipType.toUpperCase().equals("R")){
			newShip = new RocketEnemyShip();
		}
		else if(newShipType.toUpperCase().equals("U")){
			newShip = new UFOEnemyShip();
		}
		else if(newShipType.toUpperCase().equals("M")){
			newShip = new MothershipEnemyShip();
		}
		
		return newShip;
	}

}
