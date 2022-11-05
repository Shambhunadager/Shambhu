package abstraction.interface_example.multiple_inheritance.Power;

public class User implements Lamp,Fan {

	public void light() {
		System.out.println("used for light");
	}
	
	public void air() {
		System.out.println("used for air");
	}
	
}
