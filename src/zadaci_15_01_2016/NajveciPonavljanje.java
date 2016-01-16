/*Napisati program koji uèitava niz brojeva, pronalazi najveæi broj te ispisruje koliko se puta taj broj ponavlja. 
 Pretpostavimo da se unos brojeva završava sa nulom.*/
package zadaci_15_01_2016;

import java.util.*;

public class NajveciPonavljanje {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);
		ArrayList<Integer> niz = new ArrayList<Integer>();

		int a = 1;
		int max = 0;
		while (a != 0) { //kada unesemo nulu prekidamo petlju
			System.out.println("Unesite neki broj, ukoliko zelite prekinuti niz pritisnite 0: ");
			a = ulaz.nextInt(); //unosenje podataka
			niz.add(a);         // i dodavanje u niz
		}
		System.out.println("Niz koji ste unijeli izgleda ovako: ");
		for(int i : niz){
			System.out.print(i+" "); //prikaz niza
		}
		int najveci=0; 
		for(int i: niz){
			if(i>najveci){
				najveci=i;
			}
		}
		int brojac = 0;
		for (int i : niz) {
			if (i == najveci) {
				brojac++;
			}
			
		}
		System.out.println();
		System.out.println("Najveci broj u nizu je "+najveci);
		System.out.println("Broj "+najveci+" se ponovio "+brojac+" puta.");
	}

}
