/*Napisati metodu koja nalazi najmanji element u nizu decimalnih vrijednosti koristeæi se sljedeæim headerom:

public static double min(double[ ] array)

Napišite potom test program koji pita korisnika da unese deset brojeva te poziva ovu metodu da vrati najmanji element u nizu.
*/
package zadaci_17_01_2016;

import java.util.Scanner;

public class najmanjiBroj {

	public static double min(double[] niz) {

		double a = 1000000; //posto trazi da inicijalizujem varijablu a unio sam veci broj

		for (int i = 0; i < niz.length; i++) {
			if (niz[i] < a) // ako je clan niza manji od a onda a dodjeljujemo vrijednost tog clana
				a = niz[i];
		}
		return a;
	}

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);

		System.out.println("Molimo unesite 10 brojeva u niz: ");
		double[] niz = new double[10];
		for (int i = 0; i < niz.length; i++) {
			niz[i] = ulaz.nextDouble();
		}
		System.out.println("Najmanji broj u nizu koji ste unijeli je " + min(niz));
	}

}
