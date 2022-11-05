package encapsulation.encapsulation_example;

public class LaptopTest {

	public static void main(String[] args) {
		
		Laptop laptop=new Laptop();
		
		System.out.println(laptop.getName());
		
	 laptop.setName("HP");
	laptop.setColour("Black");
	laptop.setSize("5");
	
	System.out.println("Laptop name= "+ laptop.getName());
	System.out.println("Laptop colour= " + laptop.getColour());
	System.out.println("Laptop size= " + laptop.getSize());
	
	
	}
	
}
