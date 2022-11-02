package abstraction.interface_example.loose_coupling.Bank;

public class BankDemo {

	public static void main(String[] args) {
		
		Sbi sbi=new Sbi();
		Karnataka karnataka=new Karnataka();
		Canara canara=new Canara();
		Atm atm=new Atm();
		
		atm.slot(sbi);
		atm.slot(canara);
		atm.slot(karnataka);
	}
}
