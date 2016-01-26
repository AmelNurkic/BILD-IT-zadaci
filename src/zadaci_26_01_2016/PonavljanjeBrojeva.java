/*Napisati program koji uèitava cijele brojeve u rasponu od 1 do 100 te broji i ispisuje koliko je koji broj puta unijet. 
Pretpostavimo da nula prekida unos brojeva. 
Ukoliko unesemo sljedeæi niz brojeva 2 5 6 23 42 58 2 6 0 program nam ispisuje da se broj 2 ponavlja 2 puta, 
 broj 5 jednom, broj 6 2 puta, broj 23 jednom, itd.
*/
package zadaci_26_01_2016;

import java.util.*;

public class PonavljanjeBrojeva {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<Integer>();
		int a = 1;
		while (a != 0) {
			System.out.println("Unesite broj");
			a = ulaz.nextInt();
			lista.add(a);
		}
		// kreiranje niza od 100 clanova
		int[] brojac = new int[100];
		// prolaz kroz brojeve od 1 do 100
		for (int i = 1; i <= 100; i++) {
			// prolaz kroz listu koju je unijeo korisnik
			for (int j = 0; j < lista.size(); j++) {
				// u brojacu su sad svi clanovi jedanki nuli, ako je "i" jednak
				// clanu u listi povecaj clan brojaca
				if (i == lista.get(j)) {
					brojac[i]++;
				}
			}
		}
		for (int i = 1; i < brojac.length; i++) {
			// ako u nizu brojac clan ima vrijednost vecu od nule ispisi koliko se koji broj puta ponovio
			// naravno ako korisnik bude unosio vece brojeve od 100 oni se nece racunati.
			if (brojac[i] > 0) {
				System.out.println("Broj " + i + " se ponovio " + brojac[i] + " puta.");
			}
		}
		ulaz.close();

	}

}
