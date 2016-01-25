/*Napisati program koji pita korisnika da unese broj minuta (npr. 1 milijardu) te ispiše korisniku koliko je to u godinama i danima. 
 * Zbog jednostavnosti, pretpostavimo da godina ima 365 dana.*/
package zadaci_25_01_2016;

import java.util.*;

public class MinuteToGodineDani {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);
		int minute = ulaz.nextInt();

		int godine = (minute / (60 * 24 * 365));
		int ostatakMinuta = (minute % (60 * 24 * 365));
		int dani = ostatakMinuta / (60 * 24);

		System.out.println("U " + minute + " minuta ima " + godine + " godina i " + dani + " dana.");

		ulaz.close();

	}

}
