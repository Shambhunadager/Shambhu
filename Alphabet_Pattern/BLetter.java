class B_Alphabet{

 public static void main(String[] args){
 
 int n=7;
 
 for(int i=0; i<n; i++){
 
   for(int j=0; j<n; j++){
   
    if(i==0 || j==0 || i==n-1 || i==3&&j<3 || j==6-i&&j>2 || j==i&&i>2){
	
  System.out.print("*" + " ");
  }
 
 else 
 {
 
 System.out.print(" " + " ");
 }
 }
 System.out.println();
 
 
 }
 
 }
}