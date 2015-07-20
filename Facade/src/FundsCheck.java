
public class FundsCheck {
	private double funds = 1000.00; 
	
	public double getFunds() { return this.funds; }
	
	public void withdrawFunds(double fundsWithdrawn) {
		this.funds -= fundsWithdrawn;
	}
	
	public void depositFunds(double fundsDeposited) {
		this.funds += fundsDeposited;
	}
	
	public boolean makeWithdraw(double cashToWithdraw) {
		if(cashToWithdraw > getFunds()) {
			System.out.println("Error: Insufficient funds for withdrawl...");
			System.out.println("Current Balance: "+getFunds());
			return false;
		} else {
			withdrawFunds(cashToWithdraw);
			System.out.println("Success! Withdraw Complete.");
			System.out.println("Current Balance: "+getFunds());
			return true;
		}
	}
	
	public void makeDeposit(double cashToDeposit) {
		depositFunds(cashToDeposit);
		System.out.println("Success! Deposit Complete.");
		System.out.println("Current Balance: "+getFunds());
	}
}
