package abstraction.interface_example.multiple_inheritance;

public abstract class TaxCalculator implements StateTax, CentralTax {

	public void incomeTax() {
		
		System.out.println("Income tax is100 Rs");
		
	}
	
	public void electricitytax() {
		
		System.out.println("Electricity tax is 50 Rs");
	}

	
	
	
}
