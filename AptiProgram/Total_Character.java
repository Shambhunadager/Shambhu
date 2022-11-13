package AptiProgram;

public class Total_Character {

	 public static void main(String[] args) {
		 
		String s="All the best...!!";
		int count=0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='-' || s.charAt(i)=='.' || s.charAt(i)=='!' || s.charAt(i)==s.charAt(i) ) {
			
				count++;
			}
		}
		System.out.println("Total character number :" + count);
	 }
	
}
