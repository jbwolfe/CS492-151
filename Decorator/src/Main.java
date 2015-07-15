
public class Main {
	public static void main(String[] args) {
		Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
		Pizza noCheesePizza = new TomatoSauce(new PlainPizza());
		
		System.out.println("Ingredients: " + basicPizza.getDescription());
		System.out.println("Cost: " + basicPizza.getCost());
		System.out.println();
		System.out.println("Ingredients: " + noCheesePizza.getDescription());
		System.out.println("Cost: " + noCheesePizza.getCost());
	}
}
