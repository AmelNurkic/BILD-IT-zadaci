/*Napisati program koji uèitava neodreðen broj cijelih brojeva, odreðuje koliko je pozitivnih brojeva korisnik unijeo, 
koliko negativnih te izraèunava ukupnu sumu i prosjek svih unesenih brojeva. (Korisnik prekida unos tako što unese nulu). 
Na primjer, ukoliko korisnik unese 1 2 -1 3 0 program treba da ispiše da je broj pozitivnih brojeva 3, 
negativnih brojeva 1, suma ili zbir su 5.0 a prosjek svih brojeva je 1.25.*/
package zadaci_25_01_2016;

import java.util.*;

public class PozNegSumAvg {
	// metoda koja zbraja sve clanove u listi
	public static double sum(ArrayList<Integer> lista) {
		double zbir = 0;
		for (int i : lista) {
			zbir += i;
		}
		return zbir;
	}

	// iskoristio sam prethodnu metodu u ovoj, znaci suma svih podjeljena sa
	// brojem clanova u listi, -1 je da ne bi racunao i 0
	public static double avg(ArrayList<Integer> lista) {
		double prosjek = sum(lista) / (lista.size() - 1);
		return prosjek;
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite brojeve");
		int a = 1;
		ArrayList<Integer> brojevi = new ArrayList<Integer>();
		int brojacPoz = 0;
		int brojacNeg = 0;
		while (a != 0) {
			a = ulaz.nextInt();
			brojevi.add(a);
			if (a < 0) {
				brojacNeg++;
			}
			if (a > 0) {
				brojacPoz++;
			}

		}
		System.out.println("Broj pozitivnih: " + brojacPoz);
		System.out.println("Broj negativnih: " + brojacNeg);
		System.out.println("Suma: " + sum(brojevi));
		System.out.println("Prosjek: " + avg(brojevi));
		ulaz.close();
	}

}
