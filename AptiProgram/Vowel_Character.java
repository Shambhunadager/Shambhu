package AptiProgram;

import java.util.Scanner;
public class Vowel_Character {
   

public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 String b=sc.nextLine();
	  
	   int count=0;
	   int sum=0;
	   b=b.toLowerCase();
	   for(int i=0; i<b.length();i++) {
	     
	   if(b.charAt(i)=='a' || b.charAt(i)=='e' || b.charAt(i)=='i' || b.charAt(i)=='o' || b.charAt(i)=='u') {
		  
		   count++;
	   }
	   
	   else 
		   if(b.charAt(i)>='a' && b.charAt(i)<='z') {
			   sum++;
		   }
	   }
	   System.out.println("Vowel : " + count);

		   System.out.println("Consonants : " + sum);
	   
   }
}
	

