/*Napisati program koji pita korisnika da unese imena tri grada te ih ispiše u abecednom redu. 
Na primjer, ukoliko korisnik unese Chicago, Los Angeles i Atlanta kao gradove, program vraæa Atlanta, Chicago, Los Angeles.*/
package zadaci_25_01_2016;

import java.util.*;

public class SortiranjeGradova {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);
		//posto korisnik treba unijeti 3 grada i velicina niza je 3
		String[] gradovi = new String[3];
		System.out.println("Unesite 3 grada: ");
		//unos 3 grada od korisnika
		for (int i = 0; i < gradovi.length; i++) {
			gradovi[i] = ulaz.nextLine();
		}
		// sortiranje gradova
		java.util.Arrays.sort(gradovi);
		System.out.println("Gradovi koje ste unijeli po abecedi: ");
		// izbacivanje sortiranih gradova
		for (String i : gradovi) {
			System.out.println(i);
		}
		ulaz.close();

	}

}
