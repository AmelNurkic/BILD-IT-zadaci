/**(Even number of 1s) Write a program that generates a 6-by-6 two-dimensional
matrix filled with 0s and 1s, displays the matrix, and checks if every row and
every column have an even number of 1s.*/
package zadaci_03_02_2016;

public class EvenNumberOf1s {

	public static int oneOrZero() {
		double a = Math.random();
		if (a >= 0.5) {
			return 1;
		} else {
			return 0;

		}
	}

	// startC
	// http://stackoverflow.com/questions/33678510/how-to-display-the-number-of-rows-and-columns-in-a-matrix-with-an-even-number-of
	public static boolean rowEven(int[][] matrix) {
		int evenRowCount = 0;
		for (int row = 0; row < matrix.length; row++) {
			int rowCount = 0;
			for (int col = 0; col < matrix[row].length; col++) {
				rowCount += matrix[row][col];
			}
			if (rowCount % 2 == 0) {
				evenRowCount++;
			}
		}
		if (evenRowCount < 6) {
			return false;
		}
		return true;
	}

	public static boolean columnEven(int[][] matrix) {
		int evenColCount = 0;
		for (int col = 0; col < matrix[0].length; col++) {
			int colCount = 0;
			for (int row = 0; row < matrix.length; row++) {
				colCount += matrix[row][col];
			}
			if (colCount % 2 == 0) {
				evenColCount++;
			}
		}
		if (evenColCount < 6) {
			return false;
		}
		return true;
	}
	// endC

	public static void main(String[] args) {
		int[][] matrix = new int[6][6];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = oneOrZero();
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		if (rowEven(matrix) && columnEven(matrix)) {
			System.out.println("The matrix in all rows and column has an even number of 1s.");
		} else {
			System.out.println("The matrix in all rows and column has not an even number of 1s.");
		}

	}

}
