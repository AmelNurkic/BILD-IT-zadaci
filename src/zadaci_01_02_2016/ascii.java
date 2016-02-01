/**Napisati program koji prima ASCII kod (cijeli broj izmeðu 0 i 127) te ispisuje koji je to karakter. 
 * Na primjer, ukoliko korisnik unese 69 kao ASCII kod, program mu ispisuje da je karakter sa tim brojem karakter E.*/
package zadaci_01_02_2016;

import java.util.*;

public class ascii {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		// unos broja od korisnika
		System.out.println("Unesite broj izmeðu 0 i 127:");
		int a = ulaz.nextInt();
		// ako je broj veci od 127 ili manji od 0 izbacuj da korisnik pokusa ponovo
		while (a > 128 || a <= 0) {
			System.out.println("Broj mora biti izmeðu 0 i 127:");
			a = ulaz.nextInt();
		}
		// pretvaranje broja u karakter
		char b = (char) a;
		System.out.println("Broj " + a + " u ASCII tabeli je " + b);
		ulaz.close();

	}

}
