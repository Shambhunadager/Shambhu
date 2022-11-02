package abstraction.interface_example.loose_coupling.Bank;

public class Atm {

	void slot(Deposit deposit) {
		deposit.deposit();
	
	}
	
	
}
