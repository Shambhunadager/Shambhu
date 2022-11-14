package AptiProgram;

public class FibonacciNumber {
	public static void main(String[] args) {

		int n = 10;
		int s = 1, r=1,t;
		System.out.println(s);
		System.out.println(r);

		for (int i = 2; i < n; i++) {
			t = s + r;
			System.out.println(t);
		
			r = s;
			s = t;
		}

	}
}
