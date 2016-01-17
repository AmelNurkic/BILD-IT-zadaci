/*Napisati metodu koja vraæa lokaciju najveæeg elementa u 2D nizu. Metoda treba da koristi sljedeæi header:

public static int[ ] locateLargest(double[ ][ ] a)

Napisati test program koji pita korisnika da unese 2D niz te mu ispisuje lokaciju najveæeg elementa u nizu.
*/
package zadaci_17_01_2016;

import java.util.Scanner;

public class findElement {

	public static int[] locateLargest(double[][] a) {

		int red = 0;
		int kolona = 0;
		double max = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) { // prolaz kroz matricu
				if (a[i][j] > max) { // ako je clan matrice veci od max onda se
										// max dodjeljuje vrijednost clana
					red = i; // ovdje dobijamo lokaciju reda od clana koji ima
								// najvecu vrijednost
					kolona = j; // ovdje dobijamo lokaciju kolone od clana koji
								// ima najvecu vrijednost
					max = a[i][j];
				}
			}
		}

		return new int[] { red, kolona }; // vracanje niza koji sadrzi 2
											// elementa t.j lokaciju clana sa
											// najvecom vrijednosti
	}

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite broj redova a zatim broj kolona niza: ");
		int red = ulaz.nextInt(); // korisnik unosi broj redova za 2D niz
		int kolona = ulaz.nextInt(); // korisnik unosi broj kolona za 2D niz
		double niz[][] = new double[red][kolona];

		System.out.println("Unesite niz: ");
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[i].length; j++) {
				niz[i][j] = ulaz.nextDouble(); // unos matrice
			}
		}
		System.out.println("Vasa matrica izgleda ovako:");
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[i].length; j++) {
				System.out.print(niz[i][j] + " "); // ispisivanje matrice
			}
			System.out.println();
		}
		int[] pomNiz = locateLargest(niz); // uvodjenje pomocnog niza i
											// koristenje metode za pronalazenje
											// lokacije clana sa najvecom
											// vrijednoscu
		System.out.println("Najveci clan niza se nalazi na poziciji [" + pomNiz[0] + "][" + pomNiz[1] + "]");
	}

}
