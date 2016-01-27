/*(Izraèunavanje napojnice) Napisati program koji uèitava ukupan iznos raèuna koji treba uplatiti kao 
 * i procenat tog raèuna kojeg želimo platiti kao napojnicu te izraèunava ukupan raèun i napojnicu. 
 * Na primjer, ukoliko korisnik unese 10 kao raèun i 15 % kao procenat za napojnicu 
 * program treba da ispiše da je ukupan raèun za uplatiti 11.5 a napojnica 1.5. */
package zadaci_27_01_2016;

import java.util.*;

public class Napojnica {
	//izracunava samo iznos napojnice
	public static double napojnica(double racun, int napojnica) {
		double napojnicaPara = racun * napojnica / 100;
		return napojnicaPara;
	}
	// izracunava ukupan iznos racuna
	public static double ukupno(double racun, int postotakNapojnica) {
		double ukupno = racun + napojnica(racun, postotakNapojnica);
		return ukupno;
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite racun: ");
		double racun = ulaz.nextDouble();
		System.out.println("Unesite napojnicu(postotak): ");
		int napojnica = ulaz.nextInt();
		System.out.println("Vas ukupan racun iznosi: " + ukupno(racun, napojnica) + " a napojnica je "
				+ napojnica(racun, napojnica));
		ulaz.close();
	}

}
