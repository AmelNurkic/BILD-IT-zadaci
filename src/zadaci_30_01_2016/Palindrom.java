/** Napisati program koji pita korisnika da unese cijeli trocifreni broj te provjerava da li je unijeti broj palindrom. 
 * Broj je palindrom ukoliko se èita isto i sa lijeva na desno i sa desna na lijevo npr. 121, 131, itd.*/
package zadaci_30_01_2016;

import java.util.*;

public class Palindrom {
	// provjerava da li je broj trocifren
	public static boolean jeLiTrocifren(int broj) {
		String a = "" + broj;
		if (a.length() == 3) {
			return true;
		}
		return false;
	}

	public static boolean jeLiBrojPalindrom(int number) {
		// pretvaranje broja u string
		String a = "" + number;
		char[] b = a.toCharArray();
		char[] c = new char[b.length];
		int indeks = 0;
		// upisivanje u clanova iz niza n u niz c naopako, znaci prvi ide na
		// zadnje mjesto, drugi na prezadnje ...
		for (int i = b.length - 1; i >= 0; i--) {
			c[indeks] = b[i];
			indeks++;
		}
		// pretvaranje niza c u string
		String d = new String(c);
		if (a.equals(d)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite trocifren broj:");
		int broj = ulaz.nextInt();

		if (jeLiTrocifren(broj) == false) {
			System.out.println("Broj mora bit trocifren.");
		} else if (jeLiBrojPalindrom(broj)) {
			System.out.println("Broj je palindrom.");
		} else if (jeLiBrojPalindrom(broj) == false) {
			System.out.println("Broj nije palindrom.");
		}
		ulaz.close();
	}

}
