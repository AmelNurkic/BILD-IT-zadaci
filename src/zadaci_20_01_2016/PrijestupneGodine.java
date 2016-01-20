/*Napisati program koji ispisuje sve prijestupne godine, 10 po liniji, u rasponu godina koje korisnik unese. 
 * Program pita korisnika da unese poèetnu godinu, krajnju godinu te ispisuje sve godine u tom rasponu. 
 * Razmak izmeðu godina treba biti jedan space. */
package zadaci_20_01_2016;

import java.util.*;

public class PrijestupneGodine {

	public static boolean prestupna(int godina) {
		if (((godina % 4 == 0) && (godina % 100 != 0)) || (godina % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite pocetnu godinu:");
		int poc = ulaz.nextInt();
		System.out.println("Unesite krajnju godinu");
		int kraj = ulaz.nextInt();
		for (int i = poc; i < kraj; i++) {
			if (prestupna(i) == true)
				System.out.print(i + " ");
		}
		ulaz.close();
	}

}
