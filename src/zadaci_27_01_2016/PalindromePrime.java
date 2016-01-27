/*Palindrome prime je prosti broj koji je takoðer i palindrom. Na primjer, 131 je palindrome prime, kao i brojevi 313 i 757. 
 * Napisati program koji ispisuje prvih 100 palindrome prime brojeva, 10 brojeva po liniji. */
package zadaci_27_01_2016;

public class PalindromePrime {
	// provjerava da li je neki broj prost broj
	public static boolean prostBroj(int a) {
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

	// ako su brojevi palindromi daje true
	public static boolean jeLiBrojPalindrom(int number) {
		// pretvaranje broja u string
		String a = "" + number;
		char[] b = a.toCharArray();
		char[] c = new char[b.length];
		int indeks = 0;
		// upisivanje u clanova iz niza n u niz c naopako, znaci prvi ide na
		// zadnje mjesto, drugi na prezadnje ...
		for (int i = b.length - 1; i >= 0; i--) {
			c[indeks] = b[i];
			indeks++;
		}
		// pretvaranje niza c u string
		String d = new String(c);
		if (a.equals(d)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int brojac = 0;
		int brojacLinije = 0;
		for (int i = 2; i < 1000000; i++) {
			if (prostBroj(i) && jeLiBrojPalindrom(i)) {
				brojac++;
				if (brojac == 101) {
					break;
				}
				System.out.print(i + " ");
				brojacLinije++;
				if (brojacLinije % 10 == 0) {
					System.out.println();
				}
			}
		}

	}

}
