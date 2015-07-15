
public class OldRobotBuilder implements RobotBuilder{

	private Robot robot;
	public OldRobotBuilder() {
		this.robot = new Robot();
	}
	
	@Override
	public void buildRobotHead() {
		// TODO Auto-generated method stub
		robot.setRobotHead("Tin head");
	}

	@Override
	public void buildRobotTorso() {
		// TODO Auto-generated method stub
		robot.setRobotTorso("Tin torso");
		
	}

	@Override
	public void buildRobotArms() {
		// TODO Auto-generated method stub
		robot.setRobotArms("Blowtorch arms");
		
	}

	@Override
	public void buildRobotLegs() {
		// TODO Auto-generated method stub
		robot.setRobotLegs("Steel casters");
		
	}
	
	@Override
	public Robot getRobot() {
		return this.robot;
	}

}
