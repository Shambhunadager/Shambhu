package core_java;

public class FinalizeTest {
  public static void main(String[] args) {
	  Marker marker=new Marker("camlin");
	  marker=null;
	  System.gc();
	  System.out.println(marker);
  }
}
