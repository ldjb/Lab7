public class BankAccount {

	private int accNum; // account number
	private String firstName; // customer's first name
	private String lastName; // customer's last name
	private double balance; // account balance
	
	// constructor
	public BankAccount(int var1, String var2, String var3) {
		accNum = var1;
		firstName = var2;
		lastName = var3;
		balance = 0;
	}
	
	public int getAccNum() {
		return accNum;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String var) {
		firstName = var;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String var) {
		lastName = var;
	}

}