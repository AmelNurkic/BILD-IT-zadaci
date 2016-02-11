/**(Largest rows and columns) Write a program that randomly fills in 0s and 1s
into an n-by-n matrix, prints the matrix, and finds the rows and columns with the
most 1s. (Hint: Use two ArrayLists to store the row and column indices with
the most 1s.)*/
package zadaci_11_02_2016;

import java.util.*;

public class LargestRowColumns {
	public static int ZeroOrOne() {
		double a = Math.random();
		if (a < 0.5) {
			return 0;
		} else
			return 1;
	}

	public static int findLargestRow(int[][] a) {

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

	public static int findLargestColumn(int[][] array) {
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

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj redova i kolona: ");
		int a = input.nextInt();
		int[][] matrix = new int[a][a];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = ZeroOrOne();
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Najveci red je na indeksu " + findLargestRow(matrix) + " a najveca kolona na indeksu "
				+ findLargestColumn(matrix));
		input.close();
	}

}
