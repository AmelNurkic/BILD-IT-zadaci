/*Napisati metodu koja prima jedan argument, broj pitanja, te generiše toliko nasumiènih, 
jednostavnih pitanja oduzimanja tipa : „Koliko je 5 - 2 ?“. 
Metoda treba da broji broj taènih i netaènih odgovora te ih ispiše korisniku.	*/
package zadaci_16_01_2016;

import java.util.Scanner;

public class Kviz {

	public static void kviz(int brojPitanja) {

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite koliko zelite pitanja ...");
		brojPitanja = ulaz.nextInt();

		int brojacTacni = 0;
		int brojacNetacni = 0;

		for (int i = 0; i < brojPitanja; i++) {
			int a = (int) (Math.random() * 100);
			int b = (int) (Math.random() * 100);
			int tacanOdgovor = a - b;
			System.out.println("Koliko je " + a + " - " + b);
			int odgovor = ulaz.nextInt();
			if (odgovor == tacanOdgovor) {
				brojacTacni++;
				System.out.println("Bravo! Vas odgovor je tacan.");
			} else {
				brojacNetacni++;
				System.out.println("Vas odgovor nije tacan");
			}
		}
		System.out.println("Imali ste " + brojacTacni + " tacnih i " + brojacNetacni + " netacnih odgovora.");

	}

	public static void main(String[] args) {
				
		kviz(3);
	}

}
