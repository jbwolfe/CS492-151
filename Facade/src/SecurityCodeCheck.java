
public class SecurityCodeCheck {
	private int securityCode = 1234;
	
	public int getSecurityCode() { return this.securityCode; }
	
	public boolean isCodeCorret(int securityCodeToCheck) {
		if(securityCodeToCheck == getSecurityCode()) {
			return true;
		} else {
			return false;
		}
	}
}
