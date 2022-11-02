package abstraction.interface_example.multiple_inheritance;

public class MultipleInheritanceDemo {

	public static void main(String[] args) {
		
		TaxCalculator taxCalculator=new TaxCalculator();
		taxCalculator.electricityTax();
		taxCalculator.incomeTax();
		
	}
	
}
