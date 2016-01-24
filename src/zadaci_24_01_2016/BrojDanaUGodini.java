/*Napisati metodu koja vraæa broj dana u godini. 
Metoda koristi sljedeæi header: public static int numberOfDayInAYear(int year). 
Napisati program koji pita korisnika da unese poèetnu godinu, krajnju godinu te ispisuje broj dana za svaku godinu u rasponu.*/
package zadaci_24_01_2016;

import java.util.Scanner;

public class BrojDanaUGodini {
	// vec koristena metoda vise puta za prestupnu godinu
	public static boolean prestupna(int godina) {
		if (((godina % 4 == 0) && (godina % 100 != 0)) || (godina % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}

	// godina ako je prestupna ima 366 dana a ako nije 365
	public static int numberOfDayInAYear(int year) {
		if (prestupna(year) == false) {
			return 365;
		}
		return 366;
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		// unos pocetne i zavrsne godine
		System.out.println("Unesite pocetnu godinu");
		int a = ulaz.nextInt();
		System.out.println("Unesite zavrsnu godinu");
		int b = ulaz.nextInt();
		int brojac = 0;
		for (int i = a; i <= b; i++) { // i ide od a koji unosi korisnik pa do b
										// ukljucujuci i njega u ovom slucaju
			System.out.print(i + "-" + numberOfDayInAYear(i) + " ");
			brojac++;
			if (brojac % 10 == 0) { // prelazak u novu liniju ako ima deset
				System.out.println();
			}
		}
		ulaz.close();
	}

}
