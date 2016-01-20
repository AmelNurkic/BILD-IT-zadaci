/*Ako imamo ubrzanje aviona a te brzinu pri kojoj avion uzlijeće v, možemo izračunati minimalnu dužinu piste potrebne 
 * da avion uzleti koristeći se sljedećom formulom: 
 * 
 * dužina = v * v / 2a. 
 * Napisati program koji pita korisnika da unese v u m/s i a u m/s² te ispisuje korisniku minimalnu dužinu piste. 
 * (Primjer: ukoliko unesemo 60 za brzinu i 3.5 za ubrzanje dužina piste je 514.286)*/
package zadaci_20_01_2016;

import java.util.*;

public class aFion {
	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite brzinu: ");
		double v = ulaz.nextDouble();
		System.out.println("Unesite ubrzanje: ");
		double a = ulaz.nextDouble();

		double duzina = (v * v) / (2 * a);
		System.out.println("Duzina piste: " + duzina);

		ulaz.close();
	}
}
