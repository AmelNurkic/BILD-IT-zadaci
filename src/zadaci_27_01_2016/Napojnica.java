/*(Izra�unavanje napojnice) Napisati program koji u�itava ukupan iznos ra�una koji treba uplatiti kao 
 * i procenat tog ra�una kojeg �elimo platiti kao napojnicu te izra�unava ukupan ra�un i napojnicu. 
 * Na primjer, ukoliko korisnik unese 10 kao ra�un i 15 % kao procenat za napojnicu 
 * program treba da ispi�e da je ukupan ra�un za uplatiti 11.5 a napojnica 1.5. */
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
