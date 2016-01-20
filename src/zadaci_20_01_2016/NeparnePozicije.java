/*Napisati program koji pita korisnika da unese neki string te mu ispisuje sve karaktere koji se nalaze na neparnim 
 pozicijama. Na primjer, ako korisnik unese string Beijing Chicago, program vraæa BiigCiao.*/
package zadaci_20_01_2016;

import java.util.*;

public class NeparnePozicije {

	public static boolean neparni(int broj) {
		if (broj % 2 == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite string: ");
		String string = ulaz.nextLine();
		char[] c = string.toCharArray();

		for (int i = 0; i < c.length; i++) {
			if (neparni(i) == true)
				System.out.print(c[i]);
		}
		ulaz.close();
	}
}
