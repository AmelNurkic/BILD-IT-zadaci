package MiniProjekt4;

import java.util.*;

public class Hangman {
	// ispisuje char array
	public static void ispisi(char[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}

	// ukoliko korisnik pogodi daje true
	public static boolean pogodak(char guess, char[] array) {
		for (int i = 0; i < array.length; i++) {
			if (guess == array[i]) {
				return true;
			}
		}
		return false;
	}

	// kad korisnik pogodi slovo ubacuje u char array to slovo na mjesto gdje
	// treba ici
	public static void ubaci(char guess, char[] ifHaveGuess, char[] insertGuess) {
		for (int i = 0; i < ifHaveGuess.length; i++) {
			if (guess == ifHaveGuess[i]) {
				insertGuess[i] = guess;
			}
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite rijec:");
		// unos rijeci koju treba pogadjati
		String word = input.next();
		// prebacujemo string u char array i dodjeljujemo mu zvjezdice kako bi
		// sakrili rijec
		char[] chars = new char[word.length()];
		for (int i = 0; i < chars.length; i++) {
			chars[i] = '*';
		}
		// pravimo jos jedan char array kako bi mogli prethodni porediti sa njim
		char[] chars2 = word.toCharArray();
		// broj pokusaja
		int zivoti = 5;
		blok1: while (zivoti > -1) {
			// ako su oba char array-a isti onda je korisnik uspio prezivjeti to
			// jest pobjedio je
			if (Arrays.equals(chars2, chars)) {
				System.out.println("Pobjedili ste! Pogodili ste sva slova. Cestitam!");
				System.out.println("Rijesenje je bilo: ");
				ispisi(chars);
				break blok1;
				// ako broj pokusaja 0 - Game over
			} else if (zivoti == 0) {
				System.out.println("Game over.");
				System.out.println("Rijesenje je bilo: ");
				ispisi(chars2);
				break blok1;
			}
			ispisi(chars);
			System.out.println();
			System.out.println("Pogodite slovo: ");
			char guess = input.next().charAt(0);
			// ako je korisnik pogodio unosimo to slovo umjesto zvjezdice
			if (pogodak(guess, chars2)) {
				ubaci(guess, chars2, chars);
				// ako ne postoji slovo onda smanjujemo broj pokusaja
			} else if (!pogodak(guess, chars2)) {
				zivoti--;
				System.out.println("Imate jos " + (zivoti) + " pokusaja.");
			}
		}

	}
}