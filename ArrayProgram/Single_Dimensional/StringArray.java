package Single_Dimensional;

public class StringArray {
	public static void main(String[] args) {
		String arr[] = { "mango", "chike", "orange", "apple" };
		String search = "apple";
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (search == arr[i]) {
				System.out.println("apple is present:" + arr[i]);
				sum++;
			}
		}
			if (sum == 0) {
				System.out.println("not apple ");
			}
		}
}

