package MethodOverriding;

public class Bank {
	
	public static void main(String[] args) {
		
		RBI rbi=new RBI();
		SBI sbi=new SBI();
		HDFC hdfc=new HDFC();
		
		System.out.println(rbi.getInterestRate());
		System.out.println(sbi.getInterestRate());
		System.out.println(hdfc.getInterestRate());
		
	}

}
