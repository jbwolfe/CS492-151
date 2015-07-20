import java.util.Random;

public class EnemyRobotAdapter implements EnemyAttacker{

	EnemyRobot theRobot;
	
	public EnemyRobotAdapter(EnemyRobot newRobot) {
		this.theRobot = newRobot;
	}
	
	@Override
	public void fireWeapon() {
		Random attackMethod = new Random();
		
		switch(attackMethod.nextInt(100)%2) {
			case 0:
				theRobot.smashWithHands();
				break;
			case 1:
				theRobot.smashWithFeet();
				break;
			default:
				System.out.println("The Robot Misses");
				break;
		}
	}

	@Override
	public void driveForward() {
		theRobot.walkForward();
	}

	@Override
	public void assignDriver(String driverName) {
		theRobot.reactToHuman(driverName);
	}

}
