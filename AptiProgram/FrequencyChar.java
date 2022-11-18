package AptiProgram;

public class FrequencyChar {
	public static void main(String[] args) {
		String c = "java";
		int[] fr = new int[c.length()];
		char String[] = c.toCharArray();
		for (int i = 0; i < c.length(); i++) {
			fr[i] = 1;
			for (int j = 0; j < c.length(); j++) {
				if (String[i] == String[i]) {
					fr[i]++;
					String[j] = '0';
				}
			}

		}
		for (int i = 0; i < fr.length; i++) {
			if (String[i] == ' ' && String[i] != '0') {
				System.out.println(String[i] + " " + fr[i]);

			}
		}
	}

}
