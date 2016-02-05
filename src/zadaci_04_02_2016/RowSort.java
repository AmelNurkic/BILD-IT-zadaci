/**(Row sorting) Implement the following method to sort the rows in a twodimensional
array. A new array is returned and the original array is intact.
public static double[][] sortRows(double[][] m)
Write a test program that prompts the user to enter a 3 * 3 matrix of double
values and displays a new row-sorted matrix. Here is a sample run:
Enter a 3-by-3 matrix row by row:

0.15 0.875 0.375
0.55 0.005 0.225
0.30 0.12 0.4
The row-sorted array is

0.15 0.375 0.875
0.005 0.225 0.55
0.12 0.30 0.4
*/
package zadaci_04_02_2016;

import java.util.*;

public class RowSort {

	public static double[][] sortRows(double[][] m) {
		// 2D niz je zapravo niz nizova, tako da mozemo postaviti ovako
		for (double[] help : m) {
			Arrays.sort(help);
		}
		return m;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] matrix = new double[3][3];
		System.out.println("Unesite matricu: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
		sortRows(matrix);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		input.close();

	}

}
