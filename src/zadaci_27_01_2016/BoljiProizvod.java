/*Pretpostavimo da kupujemo rižu ili neki drugi proizvod u dva razlièita pakovanja. 
 * Želimo napisati program koji uporeðuje cijene ta dva pakovanja. 
 * Program pita korisnika da unese težinu i cijenu oba pakovanja te ispisuje koje pakovanje ima bolju cijenu.*/
package zadaci_27_01_2016;

import java.util.*;

public class BoljiProizvod {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite tezinu prvog proizvoda.");
		double tezina1 = ulaz.nextDouble();
		System.out.println("Unesite cijenu prvog proizvoda.");
		double cijena1 = ulaz.nextDouble();
		System.out.println("Unesite tezinu drugog proizvoda.");
		double tezina2 = ulaz.nextDouble();
		System.out.println("Unesite cijenu drugog proizvoda.");
		double cijena2 = ulaz.nextDouble();

		double sTezina = tezina1 - tezina2;
		double sCijena = cijena1 - cijena2;
		if ((sTezina + sCijena) < 0) {
			System.out.println("Prvi proizvod ima bolju cijenu.");
		} else if ((sTezina + sCijena) > 0) {
			System.out.println("Drugi proizvod ima bolju cijenu.");
		} else if ((sTezina + sCijena) == 0) {
			System.out.println("Proizvodi imaju istu cijenu i tezinu.");
		}
		ulaz.close();
	}

}
