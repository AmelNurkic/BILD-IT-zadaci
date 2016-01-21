/*Napisati program koji ispisuje tri nasumi�na cijela broja te pita korisnika da unese njihov zbir. 
Ukoliko korisnik pogrije�i, program ispisuje pitanje ponovo sve sa porukom da poku�a ponovo.  
Ukoliko korisnik unese ta�an odgovor, program mu �estita i zavr�ava sa radom. */
package zadaci_21_01_2016;

import java.util.*;

public class Zbir {

	public static boolean zbir(int a, int b, int c, int d) {
		int zbir = a+b+c;
		if (zbir==d)
			return true;
		return false;
	}

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);
		int a, b, c;
		a = (int) (Math.random() * 100);
		b = (int) (Math.random() * 100);
		c = (int) (Math.random() * 100);
		int d = 0;

		while (zbir(a, b, c, d) == false) {
			System.out.println("Koliko je " + a + " + " + b + " + " + c + " ?");
			d = ulaz.nextInt();
		}
		
		System.out.println("Cestitamo! Odgovorili ste tacno.");
		ulaz.close();
	}

}
