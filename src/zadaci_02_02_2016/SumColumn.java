/**(Sum elements column by column) Write a method that returns the sum of all the
elements in a specified column in a matrix using the following header:
public static double sumColumn(double[][] m, int columnIndex)
*/
package zadaci_02_02_2016;

import java.util.*;

public class SumColumn {

	public static double sumColumn(double[][] m, int columnIndex) {
		double sum = 0;
		for (int row = 0; row < m.length; row++) {
			sum = sum + m[row][columnIndex];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] matrix = new double[3][4];
		System.out.println("Enter a 3-by-4 matrix row by row:");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Sum of the elements at column 0 is " + sumColumn(matrix, 0));
		System.out.println("Sum of the elements at column 1 is " + sumColumn(matrix, 1));
		System.out.println("Sum of the elements at column 2 is " + sumColumn(matrix, 2));
		System.out.println("Sum of the elements at column 3 is " + sumColumn(matrix, 3));
		input.close();
	}

}
