package core_java;

public class Radio implements Cloneable  {
	String brand;
	double price;
    Battery	battery;
	
	public Radio(String brand,double price,Battery battery) {
		this.brand=brand;
		this.price=price;
		this.battery=battery;
	}
public Radio clone() throws CloneNotSupportedException{
	Radio duplicate=(Radio)super.clone();
	duplicate.battery=new Battery("everyday");
	return duplicate;
	
}
@Override
public String toString() {
	return "Radio [brand=" + brand + ", price=" + price + ", battery=" + battery + "]";
}

}
