
public abstract class EnemyShip {
	private String name;
	
	ESWeapon weapon;
	ESEngine engine;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	abstract void makeShip();
	
	public void followHeroShip(){
		System.out.println(getName() + " is following the hero at " + this.engine);
	}
	
	public void displayEnemyShip() {
		System.out.println(getName() + " is on the radar!");
	}
	
	public void enemyShipShoots() {
		System.out.println(getName() + " atacks and does " + this.weapon);
	}
	
	public String toString(){
		String infoOnShip = "The " + this.name + " has a top speed of " + this.engine + " and an attack power of " + this.weapon;
		
		return infoOnShip;
	}
}