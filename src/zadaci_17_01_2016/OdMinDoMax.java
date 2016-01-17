/*Implementirati sljedeæu metodu da sortira redove u 2D nizu.

public static double[ ][ ] sortRows(double[ ][ ] array)

Napisati testni program koji pita korisnika da unese 3x3 matricu (ili da pita korisnika koliku matricu želi unijeti)
te mu ispisuje na konzoli matricu sa sortiranim redovima - od najmanjeg broja do najveæeg.
*/
package zadaci_17_01_2016;

import java.util.Scanner;

public class OdMinDoMax {

	public static double[][] sortRows(double[][] niz) {

		double[][] pomNiz = new double[niz.length][niz[0].length];

		for (int i = 0; i < niz.length; i++)
			for (int j = 0; j < niz[0].length; j++)
				pomNiz[i][j] = niz[i][j];

		for (int i = 0; i < pomNiz.length; i++) {

			for (int j = 0; j < pomNiz[0].length - 1; j++) {

				double najmanji = pomNiz[i][j];
				int a = j;
				for (int kolona = j + 1; kolona < pomNiz[0].length; kolona++) {

					if (najmanji > pomNiz[i][kolona]) {
						najmanji = pomNiz[i][kolona];
						a = kolona;
					}
				}

				if (a != j) {
					pomNiz[i][a] = pomNiz[i][j];
					pomNiz[i][j] = najmanji;
				}
			}
		}

		return pomNiz;
	}

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);

		double[][] niz = new double[3][3];
		System.out.println("Unesite clanove niza: ");
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[i].length; j++) {
				niz[i][j] = ulaz.nextDouble();
			}
		}
		double[][] sortiranaLista = sortRows(niz);
		System.out.println("Sortirana lista izgleda ovako: ");
		for (int i = 0; i < sortiranaLista.length; i++) {
			for (int j = 0; j < sortiranaLista[i].length; j++) {
				System.out.print(sortiranaLista[i][j] + " ");
			}
			System.out.println();
		}

	}

}
