package pre_exam;

public class Q10 {
	public static void main(String[] args) {
		int sum = 0;
		int[][] d = {
				{ 23, 56, 12 },
				{ 33, 24, 51 },
				{ 49, 13, 41 }

		};
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sum += d[i][j];
				System.out.println(sum);
			}
		}

	}
}
