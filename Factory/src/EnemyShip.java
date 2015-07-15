
public abstract class EnemyShip {
	private String name;
	private double amtDamage;

	public String getName() {
		return this.name;
	}

	public void setName(String newName) {
		this.name = newName;
	}
	
	public double getDamage() {
		return this.amtDamage;
	}
	
	public void setDamage(double newDamage) {
		this.amtDamage = newDamage;
	}
	
	public void followHeroShip() {
		System.out.println(getName() + " is following the hero!");
	}
	
	public void displayEnemyShip() {
		System.out.println(getName() + " is on the radar!");
	}
	
	public void enemyShipShoots() {
		System.out.println(getName() + " shoots and inflicts " + getDamage() + " damage!");
	}
	

	
}
