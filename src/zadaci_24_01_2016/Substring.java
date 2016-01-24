/*Napisati program koji pita korisnika da unese dva stringa te provjerava i ispisuje da li je drugi string substring prvog.
Na primjer, ukoliko korisnik unese ABCD kao prvi string a BC kao drugi string program mu ispisuje da je BC 
substring ABCD stringa.*/
package zadaci_24_01_2016;

import java.util.Scanner;

public class Substring {
	// daje true ukoliko je b substring a
	public static boolean sabstring(String a, String b) {
		if (a.contains(b)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite prvu rijec:");
		String prva = ulaz.next();
		System.out.println("Unesite druga rijec:");
		String druga = ulaz.next();
		if (sabstring(prva, druga))
			System.out.println("U rijeci " + prva + " postoji rijec " + druga);
		else {
			System.out.println("U rijeci " + prva + " ne postoji rijec " + druga);
		}

		ulaz.close();

	}

}
