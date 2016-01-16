/*Pretpostavimo da su slova A, E, I, O i U samoglasnici. 
 * Napisati program koji pita korisnika da unese string te mu ispište broj samoglasnika i suglasnika u datom stringu.
 */
package zadaci_15_01_2016;

import java.util.Scanner;

public class Samoglasnici {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);

		System.out.println("Molimo unesite neku rijec");
		String rijec = ulaz.next(); // Ovdje nam korisnik unosi nesto u string rijec pomocu skenera
		char[] rijeci = rijec.toCharArray(); //String rijec koju dobijamo od korisnika pretvaramo u char array
		int brojac = 0; //treba nam brojac kako bi znali koliko u char array-u ima samoglasnika
		for (int i = 0; i < rijec.length(); i++) {
			if ((rijeci[i] == 65) || (rijeci[i] == 69) || (rijeci[i] == 73) || (rijeci[i] == 79)
					|| (rijeci[i] == 85) || (rijeci[i] == 97) || (rijeci[i] == 101) || (rijeci[i] == 105)
					|| (rijeci[i] == 111) || (rijeci[i] == 1117)) 
			brojac++; //ako je char samoglasnik onda brojac povecavamo za 1
		}
		System.out.println("Rijec "+rijec+" ima "+brojac+" samoglasnika"); 
		ulaz.close();
	}
}
