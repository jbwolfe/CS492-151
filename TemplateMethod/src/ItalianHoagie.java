
public class ItalianHoagie extends Hoagie{

	String[] meatsUsed =  {"Salami", "Pepperoni", "Boiled Ham", "Capicola"};
	String[] cheesesUsed = { "Provolone" };
	String[] vegetablesUsed = { "Lettuce", "Tomatoes", "Onions", "Banana Peppers" };
	String[] condimentsUsed = { "Oil", "Vinegar" };
	
	@Override
	void addMeat() {
		System.out.print("Adding meat:");
		
		for(String meat : this.meatsUsed) {
			System.out.print(meat + " ");
		}
		
		System.out.print("\n");
	}

	@Override
	void addCheese() {
		System.out.print("Adding cheese:");
		
		for(String cheese : this.cheesesUsed) {
			System.out.print(cheese + " ");
		}
		
		System.out.print("\n");
	}

	@Override
	void addVegetables() {
		System.out.print("Adding vegetable:");
		
		for(String vegetable : this.vegetablesUsed) {
			System.out.print(vegetable + " ");
		}
		
		System.out.print("\n");
	}

	@Override
	void addCondiments() {
		System.out.print("Adding condiments:");
		
		for(String condiment : this.condimentsUsed) {
			System.out.print(condiment + " ");
		}
		
		System.out.print("\n");
	}

	
}
