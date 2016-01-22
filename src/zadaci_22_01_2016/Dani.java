/*Napisati program koji pita korisnika da unese cijeli broj za današnji dan u sedmici (0 za ponedjeljak, 1 za utorak...) 
 i da unese broj dana nakon današnjeg dana te mu ispiše koji je to dan u buduænosti. 
(Primjer: ako korisnik unese 1 kao današnji dan a 3 kao dan u buduænosti program mu ispisuje da je danas utorak 
 a dan u buduænosti je petak.) */
package zadaci_22_01_2016;

import java.util.*;

public class Dani {

	// odredjuje dan u sedmici po oznakama 0-6
	public static String daniUSedmici(int a) {
		if (a == 0)
			return "ponedjeljak";
		if (a == 1)
			return "utorak";
		if (a == 2)
			return "srijeda";
		if (a == 3)
			return "cetvrtak";
		if (a == 4)
			return "petak";
		if (a == 5)
			return "subota";
		if (a == 6)
			return "nedjelja";
		return null;
	}

	// odredjuje buduci dan
	public static int daniUSedmici2(int a, int b) {
		int c = (a + b) % 7;
		return c;
	}

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);
		int a = 7;
		// ako korisnik unese veci broj od 6 ili manji od 0 ponavlja mu pitanje
		while (a < 0 || a > 6) {
			System.out.println("Unesite pocetni dan 0-6");
			a = ulaz.nextInt();
		}
		System.out.println("Unesite buduci dan.");
		int b = ulaz.nextInt();
		System.out.println("Danas je " + daniUSedmici(a) + " a za " + b + " dana ce biti "
				+ daniUSedmici(daniUSedmici2(a, b)) + ".");

		ulaz.close();
	}

}
