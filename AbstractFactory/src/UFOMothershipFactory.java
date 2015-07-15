
public class UFOMothershipFactory implements EnemyShipFactory {

	@Override
	public ESWeapon addESGun() {
		return new ESUFOMothershipGun();
	}

	@Override
	public ESEngine addESEngine() {
		return new ESUFOMothershipEngine();
	}

}
