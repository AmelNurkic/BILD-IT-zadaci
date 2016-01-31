/**Napisati program koji pita korisnika da unese cijeli broj te ispisuje piramidu svih brojeva do tog broja. 
 * (Na primjer, ukoliko korisnik unese 7 vrh piramide je broj 1, red ispod vrha piramide je 2 1 2, red ispod je 3 2 1 2 3, 
 * red ispod 4 3 2 1 2 3 4 itd.)*/
package zadaci_30_01_2016;

import java.util.*;

public class Piramida {

	public static void main(String[] args) {
		// startC
		// https://github.com/skilledmonster/Core_Java_How_To_Examples/blob/master/src/main/java/com/skilledmonster/examples/loops/PyramidNestedForLoopExample_11.java
		System.out.println("Unesite broj: ");
		Scanner ulaz = new Scanner(System.in);
		int x = ulaz.nextInt();

		for (int i = 1; i <= x; i++) {
			// prazna mjesta
			for (int j = 1; j <= x - i; j++) {
				System.out.print("   ");
			}
			// lijeva strana piramide
			for (int k = i; k >= 1; k--) {
				System.out.print((k >= 10) ? +k : "  " + k);
			}
			// desna strana piramide
			for (int k = 2; k <= i; k++) {
				System.out.print((k >= 10) ? +k : "  " + k);
			}
			// prelazak u novi red
			System.out.println();
			// endC
		}
		ulaz.close();
	}

}
