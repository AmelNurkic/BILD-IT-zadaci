/*Napisati program koji uèitava neodreðeni broj cijelih brojeva (nula prekida unos) te ispisuje koliko je brojeva bilo iznad 
 ili jednako prosjeku svih unešenih brojeva a koliko je bilo brojeva ispod prosjeka. 
 Pretpostavimo da je maksimalan niz brojeva koje korisnik može unijeti 100.
 */
package zadaci_18_01_2016;

import java.util.*;

public class Prosjek {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unosite brojeve: ");
		int broj = 2;
		ArrayList<Integer> niz = new ArrayList<>();
		while (broj != 0) {
			broj = ulaz.nextInt();
			niz.add(broj);
		}

		double zbir = 0;
		for (double broj1 : niz)
			zbir += broj1;
		double prosjek = zbir / niz.size();
		int brojacIspod = 0;
		int brojacIznad = 0;
		for (double broj2 : niz)
			if (broj2 < prosjek)
				brojacIspod++;
			else
				brojacIznad++;
		
		System.out.println("Prosjek: "+prosjek);
		System.out.println("Brojevi ispod prosjeka: " + (brojacIspod-1)); //-1 zbog zadnjeg elementa 0
		System.out.println("Brojevi jednaki ili iznad prosjeka " + brojacIznad);

	}

}
