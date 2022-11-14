package AptiProgram;

public class FactorialNumber {
	public static void main(String[] args) {
		int s = 5;
		int sum = 1;

		if (s > 0 && s < 25) {
			for (int i = 1; i <= s; i++) {
				sum = i * sum;

				System.out.println(sum);
			}
		}
	}
}
