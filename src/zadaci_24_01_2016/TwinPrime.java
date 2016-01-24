/*Twin prime brojevi su par prostih brojeva koji se razlikuju za 2. Na primjer, brojevi 3 i 5 su twin primes, 
 * brojevi 5 i 7 i 11 i 13 su takoðer twin primes. 
 * Napisati program koji ispisuje sve twin prime brojeve manje od 10000, 10 parova po liniji. */
package zadaci_24_01_2016;

import java.util.ArrayList;

public class TwinPrime {
	// provjerava da li je neki broj prost broj
	public static boolean prostBroj(int a) {
		int i;
		for (i = 2; i < a; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		ArrayList<Integer> prosti = new ArrayList<Integer>();
		for (int i = 2; i < 10000; i++) {
			if (prostBroj(i)) {//ako je broj prost dodaj ga u listu "prosti"
				prosti.add(i);
			}

		}
		int brojac = 0;
		for (int i = 0; i < prosti.size() - 1; i++) {	//ovom -1 sam sve po spisku
			if (prosti.get(i + 1) - prosti.get(i) == 2) {	//ukoliko je razlika izmedju dva susjedna clana u listi 2
				System.out.print(prosti.get(i) + "-" + prosti.get(i + 1) + " ");//ispisi ih
				brojac++;
				if (brojac % 10 == 0) {//prelazi u novi red ako je ispisano 10
					System.out.println();
				}
			}
		}

	}

}
