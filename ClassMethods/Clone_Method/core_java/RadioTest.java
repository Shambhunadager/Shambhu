package core_java;

public class RadioTest {
 public static void main(String[] args) {
	 Radio sony=new Radio("sony",1000.00,new Battery("cello"));
	 try {
		 
		 Radio copyOfSony=sony.clone();
		 System.out.println("details Of Sony;" + sony);
		 System.out.println("details Of copyOfSony;" + copyOfSony);
		 copyOfSony.price=5000.00;
		 copyOfSony.battery.brand="exide";
		 System.out.println("After a change.....");
		 System.out.println("details Of Sony;" + sony);
		 System.out.println("details Of copyOfSony;" + copyOfSony);
		 
	 }catch(CloneNotSupportedException e) {
		 e.printStackTrace();
	 }
 }
		 
}
