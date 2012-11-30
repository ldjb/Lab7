public class BankAccount {

	// class attributes
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
	
	// get account number
	public int getAccNum() {
		return accNum;
	}
	
	// get customer's first name
	public String getFirstName() {
		return firstName;
	}
	
	// set customer's first name
	public void setFirstName(String var) {
		firstName = var;
	}
	
	// get customer's last name
	public String getLastName() {
		return lastName;
	}
	
	// set customer's last name
	public void setLastName(String var) {
		lastName = var;
	}
	
	// get account balance
	public double getBalance() {
		return balance;
	}
	
	// increment balance by value given; return new balance
	public double modBalance(double var) {
		return balance += var;
	}

}