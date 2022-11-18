package Single_Dimensional;

public class ArrayChar {
	public static void main(String[] args) {
		char[] arr = new char[4];

		arr[0] = 'c';
		arr[1] = 'b';
		arr[2] = 'a';
		arr[3] = 'd';

		for (int i = 0; i < arr.length; i++) {
			
		}
		char min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];

			}
		}
		System.out.println("least element :" + min);
	}
}
