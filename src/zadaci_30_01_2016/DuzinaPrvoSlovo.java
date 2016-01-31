/** Napisati program koji pita korisnika da unese neki string te mu ispisuje dužinu tog stringa kao i prvo slovo stringa.*/
package zadaci_30_01_2016;

import java.util.*;

public class DuzinaPrvoSlovo {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite neku rijec:");
		String a = ulaz.next();
		// odredjivanje duzine rijeci koju unosi korisnik
		int duzinaS = a.length();
		// pretvaranje rijeci u niz karaktera
		char[] b = a.toCharArray();
		// uzimanje prvog karaktera i pretvaranje u String
		String prvoSlovoS = Character.toString(b[0]);
		System.out.println("Duzina rijeci " + a + " je " + duzinaS + " a prvo slovo " + prvoSlovoS);

		ulaz.close();
	}

}
