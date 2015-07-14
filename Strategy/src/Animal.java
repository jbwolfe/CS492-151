
public class Animal {
	private String name;
	private double height;
	private int weight;
	private String favFood;
	private double speed;
	private String sound;
	
	public Flys flyingType;
	
	public void setName(String newName) {
		this.name = newName;
	}
	public String getName() {
		return this.name;
	}
	public void setHeight(double newHeight) {
		this.height = newHeight;
	}
	public double getHeight() {
		return this.height;
	}
	public void setWeight(int newWeight) {
		if(newWeight > 0){
			this.weight = newWeight;
		} else {
			System.err.println("Weight must be larger than 0");
			System.exit(1);
		}
	}
	public int getWeight() {
		return this.weight;
	}
	public void setFavFood(String newFavFood) {
		this.favFood = newFavFood;
	}
	public String getFavFood() {
		return this.favFood;
	}
	public void setSpeed(double newSpeed) {
		this.speed = newSpeed;
	}
	public double getSpeed() {
		return this.speed;
	}
	public void setSound(String newSound) {
		this.sound = newSound;
	}
	public String getSound() {
		return this.sound;
	}
	
	
}
