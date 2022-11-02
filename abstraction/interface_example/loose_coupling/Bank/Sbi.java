package abstraction.interface_example.loose_coupling.Bank;

public class Sbi implements Deposit{
  public void deposit() {
	  
	  System.out.println("SBI bank from 500Rs deposit");
  }
}
