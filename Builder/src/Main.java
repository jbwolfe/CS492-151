
public class Main {
	public static void main(String[] args) {
		RobotBuilder oldStyleRobot = new OldRobotBuilder();
		
		RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobot);
		
		robotEngineer.makeRobot();
		
		Robot firstRobot = robotEngineer.getRobot();

		System.out.println("Robot Build!");
		System.out.println("Robot head: " + firstRobot.getRobotHead());
		System.out.println("Robot torso: " + firstRobot.getRobotTorso());
		System.out.println("Robot arms: " + firstRobot.getRobotArms());
		System.out.println("Robot legs: " + firstRobot.getRobotLegs());
	}
}
