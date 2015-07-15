
public class UFOMothership extends EnemyShip{
	
	EnemyShipFactory shipFactory;
	
	public UFOMothership(EnemyShipFactory shipFactory) {
		this.shipFactory = shipFactory;
	}

	void makeShip() {
		// TODO Auto-generated method stub
		System.out.println("Making enemy ship " + getName());
		
		weapon = shipFactory.addESGun();
		engine = shipFactory.addESEngine();
	}

}