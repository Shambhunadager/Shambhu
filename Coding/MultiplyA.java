package Coding;

public class MultiplyA {

	public static void main(String args[]) {
		int num=3,count=0,tem = 0,n;
		n=num;
		while(n>0) {
			n=n/10;
			count++;
			System.out.println(count);
			tem=(int)Math.pow(5,count);
	
		}
		
		int b=tem*num;
		System.out.println(b);
	}
	
	
}
