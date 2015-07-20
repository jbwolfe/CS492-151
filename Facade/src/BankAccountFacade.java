
public class BankAccountFacade {
	private int accountNumber;
	private int securityCode;
	
	WelcomeToBank bankWelcome;
	AccountNumberCheck accountChecker;
	SecurityCodeCheck codeChecker;
	FundsCheck fundChecker;
	
	public BankAccountFacade(int newAccountNumber, int newSecurityCode) {
		this.accountNumber = newAccountNumber;
		this.securityCode = newSecurityCode;
		
		this.bankWelcome = new WelcomeToBank();
		this.accountChecker = new AccountNumberCheck();
		this.codeChecker = new SecurityCodeCheck();
		this.fundChecker = new FundsCheck();
	}
	
	public int getAccountNumber() { 
		return this.accountNumber; 
	}
	
	public int getSecurityCode() { 
		return this.securityCode;
	}
	
	public void withdrawCash(double cashToGet) {
		if(this.accountChecker.accountActive(getAccountNumber()) &&
				this.codeChecker.isCodeCorret(getSecurityCode()) &&
				this.fundChecker.makeWithdraw(cashToGet)) {
			
			System.out.println("Transaction Complete\n");
		} else {
			System.out.println("Transaction Failed\n");
		}
	}
	
	public void depositCash(double cashToDeposit) {
		if(this.accountChecker.accountActive(getAccountNumber()) &&
				this.codeChecker.isCodeCorret(getSecurityCode())) {
			
			this.fundChecker.makeDeposit(cashToDeposit);
			System.out.println("Transaction Complete\n");
		} else {
			System.out.println("Transaction Failed\n");
		}
	}
}
