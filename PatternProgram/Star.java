class Star {
public static void main(String args[]){
  
  int n=7;
  
   for(int i=0; i<n; i++){
    for(int j=0; j<n; j++){
	
	if(i==j || j==i || i==6-j || i==3 || j==3){

	
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