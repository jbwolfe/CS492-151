
public class Main {
	public static void main(String[] args) {
		Animal sparky = new Dog();
		Animal tweety = new Bird();

		System.out.println("Sparky is going to try to fly and he " + sparky.tryToFly() + "!");
		System.out.println("Tweety is going to try to fly and she " + tweety.tryToFly() + "!");

		System.out.println();
		System.out.println("Let's try some coding magic!");
		sparky.setFlyingAbility(new CanFly());
		System.out.println();
		
		System.out.println("Sparky is going to try to fly again and he " + sparky.tryToFly());
		System.out.println("Tweety is going to try to fly again and she " + sparky.tryToFly());
	}
}
