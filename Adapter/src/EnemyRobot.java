import java.util.Random;

public class EnemyRobot {
	Random generator = new Random();
	
	public void smashWithHands() {
		int attackDamage = generator.nextInt(10) + 1;
		
		System.out.println("Enemy Robot Causes " + attackDamage + " Damage With Its Hands");
	}
	
	public void smashWithFeet() {
		int attackDamage = generator.nextInt(20) + 1;
		
		System.out.println("Enemy Robot Causes " + attackDamage + " Damage With Its Feet");
	}
	
	public void walkForward() {
		int movement = generator.nextInt(5) + 1;
		
		System.out.println("Enemy Robot Walks Forward " + movement + " Spaces");
		
	}
	
	public void reactToHuman(String driverName) {
		System.out.println("Enemy Robot Tramps on " + driverName);
	}
}
