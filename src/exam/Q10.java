package exam;

public class Q10 {
	public static void main(String[] args) {
		int[][] d = {
				{ 23, 56, 12 },
				{ 33, 24, 51 },
				{ 49, 13, 41 }
		};
		int max = d[0][0];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (d[i][j] > max) {
					max = d[i][j];
					System.out.println(max);
				}
			}
		}
	}
}
