
public interface Flys {
	String fly();
}

class CanFly implements Flys {

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "is flying high";
	}
	
}

class CantFly implements Flys {

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "is grouned";
	}
	
}
