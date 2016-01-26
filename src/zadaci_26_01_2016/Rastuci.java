/*Napisati program koji pita korisnika da unese 3 cijela broja te mu ispiše ta ista tri broja u rastuæem redosljedu. 
 * Bonus: Napisati metodu koja prima tri cijela broja kao argumente te vraæa brojeve u rastuæem redosljedu.*/
package zadaci_26_01_2016;

import java.util.*;

public class Rastuci {
	public static void rastuci() {
		int a, b, c;
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite 3 cijela broja: ");
		// korisnik unosi 3 broja
		a = ulaz.nextInt();
		b = ulaz.nextInt();
		c = ulaz.nextInt();
		ArrayList<Integer> lista = new ArrayList<Integer>();
		// dodajemo brojeve u listu
		lista.add(a);
		lista.add(b);
		lista.add(c);
		// sortiranje liste
		Collections.sort(lista);
		// printanje liste
		for (int d : lista) {
			System.out.print(d + " ");
			ulaz.close();
		}
	}

	public static void main(String[] args) {

		rastuci();

	}

}
