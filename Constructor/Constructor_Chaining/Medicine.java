package Constructor_Chaining;

public class Medicine {
	String name;
	double price;
	String dose;
	
	
Medicine(){
	System.out.println("I am a default constructor");
}
Medicine(String name1,double price1,String dose1){
	System.out.println("I am a parameterized construxctor");
	name =name1;
	price=price1;
	dose=dose1;
}
Medicine(String name2,double price2){
	name=name2;
	price=price2;
	
	
}

}
