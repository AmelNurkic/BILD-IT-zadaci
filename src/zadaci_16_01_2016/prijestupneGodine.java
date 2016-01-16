/* Napisati program koji ispisuje sve prestupne godine, 10 po liniji, od godine 101 do 2100, odvojene jednim spaceom. 
 * Takoðer ispisati i ukupan broj prijestupnih godina u ovom vremenskom periodu.*/

package zadaci_16_01_2016;

import java.util.ArrayList;

public class prijestupneGodine {

	public static void main(String[] args) {

		int brojac = 0;
		for (int i = 101; i <= 2100; i++) {
			if ((i % 4 == 0 && i % 100 != 0) || (i % 100 == 0 && i % 400 == 0)) {
				System.out.print(i + " ");
				brojac++;
				if (brojac % 10 == 0)
					System.out.println();
			}
		}
		System.out.println();
		System.out.println("Od 101. do 2100. godine ima "+brojac+" prijestupnih godina.");
	}

}
