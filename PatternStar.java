class PatternStar{
public static void main(String args[]){
  
  int n=10;
  
   for(int i=1; i<n; i++){
    for(int j=1; j<n; j++){
	
	if(i==1 || j==1 || i==n-1 || j==n-1 || i==j || i==10-j || i==5 || j==5){
	
	System.out.print("*"+" ");
	
	}
	 else{
	 System.out.print(" "+" ");
	 
	 }
	}
   System.out.println();
   
  }
}

}