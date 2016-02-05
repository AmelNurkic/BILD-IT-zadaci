/**(Strictly identical arrays) The two-dimensional arrays m1 and m2 are strictly
identical if their corresponding elements are equal. Write a method that returns
true if m1 and m2 are strictly identical, using the following header:
public static boolean equals(int[][] m1, int[][] m2)
*/
package zadaci_04_02_2016;

public class StrictlyIdenticalArrays {

	public static boolean equals(int[][] m1, int[][] m2) {
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				// ako im je duzina redova ili kolona razlicita vrati false
				if (m1.length != m2.length && m1[i].length != m2[i].length) {
					return false;
				}
				// ako je neki clan jedne matrice razlicit od clana druge
				// matrice na istom indeksu vrati false
				if (m1[i][j] != m2[i][j]) {
					return false;

				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[][] matrix1 = { { 51, 22, 25, 6 }, { 1, 4, 24, 54, 6 } };
		int[][] matrix2 = { { 51, 22, 25, 6 }, { 1, 4, 24, 54, 6 } };
		int[][] matrix3 = { { 51, 25, 22, 6 }, { 1, 4, 24, 54, 6 } };
		System.out.println(equals(matrix1, matrix2));
		System.out.println(equals(matrix1, matrix3));

	}

}
