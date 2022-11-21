package String;

public class StringDemo {
	public static void main(String args[]) {

		String str = "xworkz";
		String str1 = "xworkz";
		String str2 = "java";
		str1 = "welcome";

		String s1 = new String("welcome");
		String internOfs1 = s1.intern();

		System.out.println(s1.equals(internOfs1));//true
		System.out.println(s1 == internOfs1);//false

		String s2 = "welcome";
		System.out.println(s2.equals(internOfs1));//true

		String s3 = new String("welcome");
		System.out.println(s1 == s3);//false 

	}
}
