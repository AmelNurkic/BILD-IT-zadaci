/**(Largest row and column) Write a program that randomly fills in 0s and 1s intoa 4-by-4 matrix, prints the matrix, 
 * and finds the first row and column with the most 1s.*/
package zadaci_03_02_2016;

public class LargestRowColumn {

	public static int findMaxRow(int[][] a) {

		int sum = 0;
		int largestRow = 0;

		for (int i = 0; i < a.length; i++) {

			int rowSum = 0;

			for (int j = 0; j < a[i].length; j++) {
				rowSum += a[i][j];
			}

			if (rowSum > sum) {
				sum = rowSum;
				largestRow = i;
			}
		}
		return largestRow;
	}

	public static int findMaxColumn(int[][] array) {
		int maxSum = 0;
		int maxColumn = 0;
		for (int j = 0; j < array[0].length; j++) {
			int columnSum = 0;
			for (int i = 0; i < array.length; i++) {
				columnSum += array[i][j];
				if (columnSum > maxSum) {
					maxSum = columnSum;
					maxColumn = j;
				}

			}
		}
		return maxColumn;
	}

	public static int oneOrZero() {
		double a = Math.random();
		if (a >= 0.5) {
			return 1;
		} else {
			return 0;

		}
	}

	public static void main(String[] args) {
		int[][] matrix = new int[4][4];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = oneOrZero();
			}
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Largest row is at index " + findMaxRow(matrix) + " and largest column is at index "
				+ findMaxColumn(matrix));
	}
}
