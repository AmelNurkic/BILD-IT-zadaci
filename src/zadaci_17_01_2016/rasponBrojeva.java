/*Napisati metodu koja prima 2 argumenta: poèetni broj i krajnji broj te printa sve proste brojeve u zadanom rangu.
BONUS: metoda može primati i treæi argument, broj brojeva za isprintati po liniji.
*/
package zadaci_17_01_2016;

public class rasponBrojeva {

	public static boolean prostBroj(int broj) {

		for (int i = 2; i <= broj / 2; i++) {
			if (broj % i == 0)
				return false;

		}
		return true;

	}

	public static void prostiBrojeviOdDo(int a, int b, int c) {

		int brojac = 0;
		for (int i = a; i < b; i++) {
			if (prostBroj(i) == true) {
				System.out.print(i + " ");
				brojac++;
				if (brojac % c == 0)
					System.out.println();
			}
		}
	}

	public static void main(String[] args) {

		prostiBrojeviOdDo(1, 1000, 15);
	}
}