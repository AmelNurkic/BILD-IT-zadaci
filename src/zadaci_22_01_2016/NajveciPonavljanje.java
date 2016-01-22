/*Napišite program koji uèitava neodreðen broj cijelih brojeva (unos prekida nula), pronalazi najveæi od unijetih brojeva 
 te ispisuje koliko se najveæi broj puta ponovio.  
 Na primjer, ukoliko unesemo 3 5 2 5 5 5 0 program ispisuje da je najveæi broj 5 te ispisuje da se isti ponavlja 4 puta. */
package zadaci_22_01_2016;

import java.util.*;

public class NajveciPonavljanje {
	// trazenje najveceg broja u listi
	public static int najveciBroj(ArrayList<Integer> brojevi) {
		int max = brojevi.get(0);

		for (Integer broj : brojevi) {
			if (broj > max)
				max = broj;
		}
		return max;
	}

	// koliko se puta ponovio najveci broj u listi
	public static int brojPonavljanjaNajveceg(ArrayList<Integer> brojevi) {
		int max = brojevi.get(0);
		for (int broj : brojevi) {
			if (broj > max)
				max = broj;
		}
		int brojac = 0;
		for (int broj : brojevi) {
			if (broj == max)
				brojac++;
		}
		return brojac;
	}

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite brojeve (0-prekid): ");
		ArrayList<Integer> brojevi = new ArrayList<Integer>();
		int a = 1;
		while (a != 0) {
			// korisnik unosi broj, prekida 0
			a = ulaz.nextInt();
			// unos broja u listu
			brojevi.add(a);
		}
		System.out.println("Najveci broj u listi je " + najveciBroj(brojevi) + " i ponovlja se "
				+ brojPonavljanjaNajveceg(brojevi) + " puta.");
		ulaz.close();
	}

}
