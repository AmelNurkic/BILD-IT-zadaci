/**(Algebra: multiply two matrices) Write a method to multiply two matrices. The header of the method is:
public static double[][] multiplyMatrix(double[][] a, double[][] b)
*/
package zadaci_03_02_2016;

import java.util.*;

public class MultiplyMatrix {

	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		double[][] c = new double[a.length][a[0].length];
		for (int row = 0; row < a.length; row++) {
			for (int column = 0; column < a[row].length; column++) {
				c[row][column] = a[row][column] * b[row][column];
			}
		}
		return c;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] matrix1 = new double[3][3];
		double[][] matrix2 = new double[3][3];
		double[][] matrix3 = new double[3][3];
		System.out.println("Enter matrix1: ");
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {
				matrix1[i][j] = input.nextDouble();
			}
		}
		System.out.println("Enter matrix2: ");
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[i].length; j++) {
				matrix2[i][j] = input.nextDouble();
			}
		}
		System.out.println("This is matrix1: ");
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {
				System.out.print(matrix1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("This is matrix2: ");
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[i].length; j++) {
				System.out.print(matrix2[i][j] + " ");
			}
			System.out.println();
		}
		matrix3 = multiplyMatrix(matrix1, matrix2);
		System.out.println("This is matrix1 * matrix2: ");
		for (int i = 0; i < matrix3.length; i++) {
			for (int j = 0; j < matrix3[i].length; j++) {
				System.out.print(matrix3[i][j] + " ");
			}
			System.out.println();
		}
		input.close();
	}

}
