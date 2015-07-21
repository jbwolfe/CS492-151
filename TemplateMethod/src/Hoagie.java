
public abstract class Hoagie {
	final void makeSandwich() {
		cutBun();
		
		if(customerWantsMeat()) {
			addMeat();
		}
		if(customerWantsCheese()) {
			addCheese();
		}
		if(customerWantsVegetables()) {
			addVegetables();
		}
		if(customerWantsCondiments()) {
			addCondiments();
		}
		
		wrapHoagie();
		System.out.println();
	}
	
	public void cutBun() {
		System.out.println("Cutting bun.");
	}
	
	abstract void addMeat();
	abstract void addCheese();
	abstract void addVegetables();
	abstract void addCondiments();
	
	boolean customerWantsMeat() {
		return true;
	}
	boolean customerWantsCheese() {
		return true;
	}
	boolean customerWantsVegetables() {
		return true;
	}
	boolean customerWantsCondiments() {
		return true;
	}
	
	public void wrapHoagie() {
		System.out.println("Wrapping hoagie.");
	}
	
}
