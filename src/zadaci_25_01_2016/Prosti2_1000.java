/*Napisati program koji ispisuje sve proste brojeve od 2 do 1000, ukljuæujuæi i 2 i 1000. 
 * Program treba da ispiše 8 brojeva po liniji te razmak izmeðu brojeva treba da bude jedan space.*/
package zadaci_25_01_2016;

public class Prosti2_1000 {

	// provjerava da li je neki broj prost broj - iskoristena metoda iz zadatka
	// sa twin prime numbers
	public static boolean prostBroj(int a) {
		int i;
		for (i = 2; i < a; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int brojac = 0;
		// petlja prolazi kroz sve brojeve od 2 do 10000 ukljucujuci i ova dva
		// broja
		for (int i = 2; i <= 1000; i++) {
			if (prostBroj(i)) {
				// ako je i prost broj izbaci njega i jedan space
				System.out.print(i + " ");
				brojac++;
				// ako je izbaceno 8 brojeva predji u novi red
				if (brojac % 8 == 0) {
					System.out.println();
				}
			}
		}

	}

}
