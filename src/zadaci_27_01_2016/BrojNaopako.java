/*Napišite metodu sa sljedeæim headerom koja vraæa naopako ispisan broj koji joj je proslijeðen kao argument: 
 * public static void reverse(int number). 
 * Na primjer, reverse(3456) treba da vrati 6543. Napisati program koji pita korisnika da unese neki cijeli broj te mu vrati isti ispisan naopako. */
package zadaci_27_01_2016;

import java.util.*;

public class BrojNaopako {

	public static void reverse(int number) {
		// pretvaranje broja u string
		String a = "" + number;
		// pretvaranje stringa u niz karaktera
		char[] b = a.toCharArray();
		// printanje niza od zadnjeg clana prema prvom
		for (int i = b.length - 1; i >= 0; i--) {
			System.out.print(b[i]);
		}

	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite broj: ");
		int a = ulaz.nextInt();
		reverse(a);
		ulaz.close();
	}

}
