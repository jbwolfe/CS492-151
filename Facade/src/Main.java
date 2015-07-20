
public class Main {
	public static void main(String[] args) {
		BankAccountFacade accessingBank = new BankAccountFacade(12345678, 1234);
		
		accessingBank.withdrawCash(50.00);
		accessingBank.withdrawCash(5000.00);
		
		accessingBank.depositCash(5000.00);
		accessingBank.withdrawCash(5900.00);
	}
}
