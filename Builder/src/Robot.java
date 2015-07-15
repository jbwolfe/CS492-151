
public class Robot implements RobotPlan {

	private String head;
	private String torso;
	private String arms;
	private String legs;
	
	@Override
	public void setRobotHead(String head) {
		// TODO Auto-generated method stub
		this.head = head;
		
	}
	public String getRobotHead() {
		return this.head;
	}

	@Override
	public void setRobotTorso(String torso) {
		// TODO Auto-generated method stub
		this.torso = torso;
		
	}

	public String getRobotTorso() {
		return this.torso;
	}

	@Override
	public void setRobotArms(String arms) {
		// TODO Auto-generated method stub
		this.arms= arms;
		
	}

	public String getRobotArms() {
		return this.arms;
	}

	@Override
	public void setRobotLegs(String legs) {
		// TODO Auto-generated method stub
		this.legs = legs;
		
	}

	public String getRobotLegs() {
		return this.legs;
	}

}
