/*Napisati metodu sa sljedeæim headerom: public static int isPrime(int n) koja provjerava da li je broj prost/prime. 
Napsati test program koji poziva ovu metodu i ispisuje sve proste brojeve u rasponu od 0 do 100000.*/
package zadaci_26_01_2016;

public class JeLiProst {

	public static boolean prostBroj(int a) {
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int brojac = 0;
		for (int i = 2; i <= 100000; i++) {
			if (prostBroj(i)) {
				System.out.print(i + " ");
				brojac++;
				if (brojac % 10 == 0) {
					System.out.println();
				}
			}

		}

	}

}
