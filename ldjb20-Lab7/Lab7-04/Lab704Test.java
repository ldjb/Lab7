public class Lab704Test {

	public static void main(String[] args) {
	
		TicketMachine machine = new TicketMachine(10);
		machine.insertMoney(1); // sneaky customer
		for (int i = 0; i < 5 ; i++) {
			machine.printTicket();
		}
		machine.empty();
		
	}

}