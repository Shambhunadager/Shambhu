package abstraction.interface_example.multiple_inheritance.Power;

public class Current implements Fan,Lamp {
 
	public void light() {
		System.out.println("used for light");
	}
	
	public void air() {
		System.out.println("used for air");
	}
}
