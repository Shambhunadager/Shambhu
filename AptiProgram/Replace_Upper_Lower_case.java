package AptiProgram;

import java.util.Scanner;

class Replace_Upper_Lower_case {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		for (int i = 0; i < str.length(); i++) {
			String s = " " + str.charAt(i);

			if (str.charAt(i) >= 67 && str.charAt(i) <= 90)
				System.out.print(s.toLowerCase());

			else if (str.charAt(i) >= 97 && str.charAt(i) <= 122)
				System.out.print(s.toUpperCase());
			else {
				System.out.println(str.charAt(i));
			}
		}
	}
}