package AptiProgram;

public class Armstong_Number {
	public static void main(String[] args) {

		int number = 25;
		int tem = number;
		int rem;
		int sum = 0;

		while (number>0) {
			rem = number%10;
			sum = sum+(rem * rem * rem);
			tem = rem/10;

		}
		if (sum == tem) {
			System.out.println("armstong");
		} else {
			System.out.println("not armstrong");
		}
	}
}
