package Coding;

public class Mulitply {
 public static void main(String args[]) {
	 int num=0,count=0,tem,n;
	 n=num;
	 while(n>0) {
		 n=n/10;
		 count++;
		 
	 }
 System.out.println(count);
 tem=(int)Math.pow(5, count);
 System.out.println(tem);
 int b=tem*num;
 System.out.println(b);
 
 
 }
 
	
	
}


