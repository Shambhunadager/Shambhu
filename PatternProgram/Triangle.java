package Pattern;

public class Triangle {

	public static void main(String agrs[]) {
		
		int n=5;
		
		for (int i=0; i<n; i++) {
		 for(int j=0; j<n; j++) {
			 
			 if(i==n-1 || i==4-j&&j<3 || j==i&&i>=3) {

			 System.out.print("*" + " ");
			 
			 }
			 else 
			 {
			 System.out.print(" "+ " ");
		 }	 
			 
	}
		 System.out.println();
		}
	}
		 
		 
}
