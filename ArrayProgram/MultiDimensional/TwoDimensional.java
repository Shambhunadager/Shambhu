package MultiDimensional;

public class TwoDimensional {
	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		int num=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=num;
				num++;
			}
		}
				
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				System.out.print(arr[i][j] + " ");
			}
		
			System.out.println();
		}
	}
}
