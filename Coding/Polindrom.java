package Coding;

public class Polindrom {
	public static void main(String agrs[]) {
		
		String x="madam";
		 int i=0,j=x.length()-1;
		 while(i<j) {
			 
			 if(x.charAt(i) != x.charAt(j)) {
			
				 System.out.println("not polindrom");
			   System.exit(0);
				 
			 }
			 i++;
			 j--;
		 }
		 
		System.out.println("polindrom");
	  
	}
	
}