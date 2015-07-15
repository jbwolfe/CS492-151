
public class Main {
	public static void main(String[] args) {
		CloneFactory animalMaker = new CloneFactory();
		
		Sheep sally = new Sheep();
		
		Sheep clonedSheep = (Sheep)animalMaker.getClone(sally);
		
		System.out.println(sally);
		System.out.println(clonedSheep);
		System.out.println("Sally's location: " + System.identityHashCode(sally));
		System.out.println("Cloned sheep's location: " + System.identityHashCode(clonedSheep));
	}
}
