package MultiDimensional;

public class ThreeDimentional {
	public static void main(String[] args) {
		int[][][] three = new int[3][3][3];
		int num = 0;
		for (int i = 0; i < three.length; i++) {
			for (int j = 0; j < three[i].length; j++) {
				for (int k = 0; k < three[j].length; k++) {
					three[i][j][k] = num;
					num++;
				}
			}
		}
		for (int i = 0; i < three.length; i++) {
			for (int j = 0; j < three[i].length; j++) {
				for (int k = 0; k < three[j].length; k++) {
					System.out.print(three[i][j][k] + " ");
				}
				System.out.println();
			
			}
			System.out.println();
		}
	}
}
