/* Napisati metodu koja printa 100 nasumiènih uppercase karaktera i 100 nasumiènih brojeva, 10 po liniji.*/
package zadaci_18_01_2016;

import java.util.*;

public class SlucajnihSto {

	// metoda koja nam daje slucajan broj u zadatom rasponu
	public static int slucajanBroj(int min, int max) {
		Random s = new Random();
		int slucajanBroj = s.nextInt((max - min) + 1) + min;

		return slucajanBroj;
	}

	// metoda koja nam printa 100 slucajnih karaktera
	public static void stoSlKaraktera() {
		int brojac = 0;
		for (int i = 0; i < 100; i++) {
			char karakter = (char) slucajanBroj(65, 90); // char u rasponu 65-90
															// su velika slova
			System.out.print(karakter + " "); // izbacuje veliko slovo i prazno
												// mjesto
			brojac++;
			if (brojac % 10 == 0)
				System.out.println();// napravi novi red ako je ispisano 10
										// karaktera
		}
	}

	// metoda koja printa 100 slucajnih brojeva
	public static void stoSLBrojeva() {
		int brojac = 0;
		int a;
		for (int i = 0; i < 100; i++) {
			a = (int) (Math.random() * 100);
			System.out.print(a + " ");
			brojac++;
			if (brojac % 10 == 0)
				System.out.println();
		}
	}

	public static void main(String[] args) {

		stoSlKaraktera();
		System.out.println();
		stoSLBrojeva();
	}
}
