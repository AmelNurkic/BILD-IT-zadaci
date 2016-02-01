/**Napisati program koji prima karakter te vraæa njegov Unicode. 
 * Primjer: ukoliko korisnik unese karakter E program mu vraæa 69 kao unicode za taj karakter.*/
package zadaci_01_02_2016;

import java.util.*;

public class KarakterUnicode {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		// unos karaktera od korisnika
		System.out.println("Unesite karakter:");
		String a = ulaz.next();
		// ako nije jedan znak izbaci upozorenje i korisniku da ponovo unese
		// karakter
		while (a.length() > 1) {
			System.out.println("Mora biti samo jedan znak! Pokusajte ponovo:");
			a = ulaz.next();
		}
		// pretvarnaje stringa u karakter
		char b = a.charAt(0);
		System.out.println((int) b);
		ulaz.close();

	}

}
