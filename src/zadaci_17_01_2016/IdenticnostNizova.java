/*Nizovi niz1 i niz2 su striktno identièni ukoliko su svi njihovi elementi na istim pozicijama jednaki. 
 Napisati metodu koja vraæa true ukoliko su nizovi niz1 i niz2 striktno identièni. Koristiti sljedeæi header:

public static boolean equals(int[ ] niz1, int[ ] niz2)

Napisati testni program koji pita korisnika da unese dva niza cijelih brojeva te provjerava da li su striktno identièni.
*/

package zadaci_17_01_2016;

import java.util.Scanner;

public class IdenticnostNizova {

	public static boolean equals(int[] niz1, int[] niz2) {

		if (niz1 != null && niz2 != null) { 
			if (niz1.length != niz2.length) {
				return false;
			} else {
				for (int i = 0; i < niz2.length; i++) {
					if (niz1[i] != niz2[i]) {
						return false;
					}
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);

		int a = 0;
		System.out.println("Unesite velicinu prvog niza");
		a = ulaz.nextInt();

		System.out.println("Unesite prvi niz:");
		int niz1[] = new int[a];
		for (int i = 0; i < niz1.length; i++) {
			niz1[i] = ulaz.nextInt();
		}
		int b = 0;
		System.out.println("Unesite velicinu drugog niza");
		b = ulaz.nextInt();
		System.out.println("Unesite drugi niz:");
		int niz2[] = new int[b];
		for (int i = 0; i < niz2.length; i++) {
			niz2[i] = ulaz.nextInt();
		}
		System.out.println(equals(niz1, niz2));
	}

}
