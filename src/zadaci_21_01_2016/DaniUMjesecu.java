/*Napisati program koji pita korisnika da unese mjesec i godinu te mu ispiše broj dana u datom mjesecu. 
 Na primjer, ukoliko korisnik unese kao godinu 2012 a kao mjesec 2, program treba ispisati da je Februar 2012 imao 29 dana. 
 Ukoliko korisnik unese kao godinu 2015 a kao mjesec 3, program treba ispisati da je Mart 2015 imao 31 dan. */
package zadaci_21_01_2016;

import java.util.*;

public class DaniUMjesecu {

	public static boolean prestupna(int godina) {
		if (((godina % 4 == 0) && (godina % 100 != 0)) || (godina % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}

	public static void brojDanaUMjesecu(int mjesec, int godina) {
		int[] dani = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (mjesec == 2 && prestupna(godina))
			dani[mjesec] = 29;
		System.out.println("Mjesec koji ste unijeli ima " + dani[mjesec] + " dana");
	}

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite mjesec: ");
		int mjesec = ulaz.nextInt();
		System.out.println("Unesite godinu: ");
		int godina = ulaz.nextInt();

		brojDanaUMjesecu(mjesec, godina);
		ulaz.close();
	}

}
