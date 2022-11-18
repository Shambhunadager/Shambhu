package Single_Dimensional;

public class ArrayChar {
	public static void main(String[] args) {
		char letter[] = { 'a', 'b', 'c', 'd' };
		
		int min=letter.length;
		for (int i = 0; i < letter.length; i++) {
			if (letter.length < min) {
				min =letter[4];
			}
		}
		System.out.println("least element" + min);
	}

}