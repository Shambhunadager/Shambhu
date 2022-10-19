package MethodOverload;

public class CricketDemo {
	
	public static void main(String[] args) {
		
		Cricket Shambhu=new Cricket();
		Speed speed=new Speed();
		Spin spin=new Spin();
		
		Shambhu.Bowling(speed);
		Shambhu.Bowling(spin);
	}

}
