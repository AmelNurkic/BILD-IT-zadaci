/*Napisati metodu sa sljedeæim headerom koja ispisuje tri broja u rastuæem redoslijedu:

public static void displaySortedNumbers(double num1, double num2, double num3). 

Napisati program koji pita korisnika da unese tri broja te ispiše ta tri broja u rastuæem redosljedu. */
package zadaci_18_01_2016;

import java.util.*;

public class poRedoslijedu {

	public static void displaySortedNumbers(double num1, double num2, double num3) {

		// prikaz brojeva koje unosi korisnik
		System.out.println("Brojevi koji ste unijeli su: ");
		double[] brojevi = { num1, num2, num3 };

		for (double broj : brojevi) {
			System.out.println(broj);
		}
		// sortiranje liste
		Arrays.sort(brojevi);
		// prikaz sortirane liste
		System.out.println("Vasi brojevi po rastucem redoslijedu: ");
		for (double broj : brojevi) {
			System.out.println(broj);
		}
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite tri broja: ");
		double a = ulaz.nextDouble();
		double b = ulaz.nextDouble();
		double c = ulaz.nextDouble();
		displaySortedNumbers(a, b, c);

	}

}
