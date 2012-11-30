public class Lab706Test {
	
	public static void greetUser(BankAccount acc) {
		System.out.println("Hello " + acc.getFirstName() + ".");
		System.out.println("Your account number is: " + acc.getAccNum());
		System.out.println("You have £" + Double.toString(acc.getBalance()) + " in your account.");
	}
	
	public static void main(String[] args) {
		// create account
		BankAccount acc = new BankAccount(23, "John", "Smith");
		
		// add £100 to account
		acc.modBalance(100);
		
		// greet user
		greetUser(acc);
		
		// withdraw £29.99
		acc.modBalance(-29.99);
		
		// change name
		acc.setFirstName("Philip");
		acc.setLastName("Pirrip");
		
		// greet user again
		greetUser(acc);
		
	}
	
}