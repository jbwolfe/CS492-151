
public class Main {
	public static void main(String[] args) {
		
		Hoagie customer1 = new ItalianHoagie();
		
		customer1.makeSandwich();
		
		Hoagie customer2 = new VegetableHoagie();
		
		customer2.makeSandwich();
	}
}
