/**U javi, short vrijednost se sprema u samo 16 bita. 
 * Napisati program koji pita korisnika da unese short broj te mu ispiše svih 16 bita za dati cijeli broj. 
 * Na primjer, ukoliko korisnik unese broj 5 - program mu ispisuje 0000000000000101*/
package zadaci_01_02_2016;

import java.util.*;

public class Short16bits {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite short vrijednost: ");
		short a = ulaz.nextShort();
		// pretvaranje short-a u 16 bitni format
		String b = Integer.toBinaryString(a);
		// dodavanje nula jer npr. ako unesemo 5 daje samo 101
		while (b.length() < 16) {
			b = "0" + b;
		}
		System.out.println("16 bit: "+b);
		ulaz.close();
	}

}
