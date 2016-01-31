/**Napisati program koji pita korisnika da unese Social Security Number (SSN) u formatu DDD-DD-DDDD gdje D predstavlja broj. 
 * Program treba da provjerava da li je broj unese�en u ispravnom formatu. 
 * Ukoliko nije, program pita korisnika da poku�a ponovo. Ukoliko jeste une�en u pravom formatu, program zavr�ava sa radom.*/
package zadaci_30_01_2016;

import java.util.*;

public class SSN {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		boolean ispravnost = false;
		System.out.println("Unesite SSN(DDD-DD-DDDD): ");
		String ssn = ulaz.next();
		// ponavljaj korisniku da unese SSN sve dok ne unese ispravan
		while (ispravnost == false) {
			System.out.println("SSN mora biti u formatu DDD-DD-DDDD. Pokusajte ponovo: ");
			ssn = ulaz.next();
			// ako duzina SSN-a nije 11 ponovi korisniku da pokusa ponovo
			if (ssn.length() != 11) {
				ispravnost = false;
			} else if (ssn.charAt(3) == '-' && ssn.charAt(6) == '-') {
				// brise povlake iz stringa kako bi mogli provjeriti da li su
				// ostali svi brojevi
				String bezPovlaka = ssn.replaceAll("-", "");
				char[] a = bezPovlaka.toCharArray();
				// ako su svi brojevi onda je SSN ispravan
				for (int i = 0; i < a.length; i++) {
					if (Character.isDigit(a[i])) {
						ispravnost = true;
					}
				}
			}
		}
		System.out.println("SSN prihvacen.");
		ulaz.close();
	}

}
