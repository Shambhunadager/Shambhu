package Coding;

public class PolindromIntger {

public static void main(String args[]) {
	
	int x=123;
	int temp=x;
	int rev=0,rem;
	
	while(temp!= 0)
	{
		rem=temp%10;
		rev=rev*10+rem;
		temp=temp/10;
		
	
	}
	if(x==rev) {
		System.out.println(x + "is polidrom");
		
	}
	else{
	System.out.println( x+ " is not polidrom");	
	}
}
	
	
}
