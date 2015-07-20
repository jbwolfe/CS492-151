
public class Main {
	public static void main(String[] args) {
		EnemyTank tank = new EnemyTank();
		
		EnemyRobot robot = new EnemyRobot();
		
		EnemyAttacker robotAdapter = new EnemyRobotAdapter(robot);
		
		System.out.println("The Robot");
		
		robot.reactToHuman("Paul");
		robot.walkForward();
		robot.smashWithHands();
		
		System.out.println("The Tank");
		
		tank.assignDriver("Fred");
		tank.driveForward();
		tank.fireWeapon();
		
		System.out.println("Robot W/ Adapter");
		
		robotAdapter.assignDriver("Tim");
		robotAdapter.driveForward();
		robotAdapter.fireWeapon();
	}
}
