class A_Alphabet{

 public static void main(String[] args){
 
 int n=7;
 
 for(int i=0; i<n; i++){
 
   for(int j=0; j<n; j++){
   
    if(j==3+i || i==3-j || j==n-1&&i>3 || j==0&&i>3 || i==3){
	
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