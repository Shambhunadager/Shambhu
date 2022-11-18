package AptiProgram;

public class TotalString {
	public static void main(String[] args) {

		String a = "Learnintg never ends";
		int count = 0;

		for (int i = 0; i < a.length(); i++)
			if (a.charAt(i) != ' ') {
				count++;
			}
		System.out.println(count);
	}

}
