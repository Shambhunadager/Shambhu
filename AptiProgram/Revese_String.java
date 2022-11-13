package AptiProgram;

public class Revese_String {
  
	public static void main(String[] args) {
		String s="Wellcome";
		String rev=" ";
		
		for (int i=s.length()-1; i>=0;i--) {
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);
	}
	
}
