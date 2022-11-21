package core_java;

public class Marker {
 String brand;
	public Marker(String brand) {
		this.brand=brand;

		
	}
	@Override
	public void finalize() throws Throwable {
		System.out.println("Fanlize method Executed.");
	}
	@Override
	public String toString() {
		return "Marker [brand=" + brand + "]";
	}
}
