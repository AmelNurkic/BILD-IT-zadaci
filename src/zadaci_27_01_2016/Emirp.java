/* Emirp brojevi (prime unazad) je nepalindromski prosti broj koji je prosti broj i kada ispišemo naopako. 
 * Na primjer, broj 17 i broj 71 su prosti brojevi tako da su brojevi i 17 i 71 emirp brojevi. 
 * Napisati program koji ispisuje prvih 100 emirp brojeva, 10 brojeva po liniji. 
*/
package zadaci_27_01_2016;

public class Emirp {
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
	public static boolean BrojJedankPalindromuDrugogBroja(int number, int number2) {
		// pretvaranje broja u string
		String a = "" + number;
		String a2 = "" + number2;
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
		// ako je prvi broj jednak naopakom drugom daje true
		if (a2.equals(d)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int brojac = 0;
		int brojacLinije = 0;
		// morao sam dati ime bloku jer obicni break ne moze zaustaviti duplu
		// petlju for
		duplaPetlja: for (int i = 10; i < 10000; i++) {
			for (int j = 10; j < 10000; j++) {
				// ako su i i j prosti brojevi i ako su palindromi izbaci ih
				if (prostBroj(i) && prostBroj(j) && BrojJedankPalindromuDrugogBroja(i, j)) {
					brojac++;
					// ako je izbacio 100 zaustavi
					if (brojac == 101) {
						break duplaPetlja;
					}
					System.out.print(i + "-" + j + " ");
					brojacLinije++;
					// ako je izbaceno 10 rezultata idi u novi red
					if (brojacLinije % 10 == 0) {
						System.out.println();
					}
				}
			}
		}
	}
}
