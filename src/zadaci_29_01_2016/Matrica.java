/*Napisati metodu koja ispisuje n x n matricu koristeæi se sljedeæim headerom: public static void printMatrix(int n). 
 * Svaki element u matrici je ili 0 ili 1, nasumièno generisana. 
 * Napisati test program koji pita korisnika da unese broj n te mu ispiše n x n matricu u konzoli.*/
package zadaci_29_01_2016;

public class Matrica {

	public static void printMatrix(int n) {
		// kreiranje nove matrice sa brojem redova n i brojem kolona n
		int[][] matrica = new int[n][n];
		// za redove
		for (int i = 0; i < matrica.length; i++) {
			// za kolone
			for (int j = 0; j < matrica[i].length; j++) {
				// dodjeljivanje svakom clanu matrice 0 ili 1
				matrica[i][j] = (int) (Math.random() * 2);
			}
		}
		// ispisvanje matrice
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		printMatrix(5);

	}

}
