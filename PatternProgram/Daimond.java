class Daimond {
public static void main(String args[]){
  
  int n=7;
  
   for(int i=0; i<n; i++){
    for(int j=0; j<n; j++){
	
	if(i==0 || j==0 || i==n-1 || j==n-1 || i==3-j || j==3+i || i==3+j || j==n-i){
	
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