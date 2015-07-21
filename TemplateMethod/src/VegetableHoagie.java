
public class VegetableHoagie extends Hoagie{

	String[] vegetablesUsed = { "Lettuce", "Tomatoes", "Onions", "Banana Peppers" };
	String[] condimentsUsed = { "Oil", "Vinegar" };

	@Override
	boolean customerWantsMeat() {
		return false;
	}
	
	@Override
	boolean customerWantsCheese() {
		return false;
	}
	
	@Override
	void addMeat() { 
		return; 
	}

	@Override
	void addCheese() { 
		return; 
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
