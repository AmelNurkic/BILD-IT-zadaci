/*Napisati program koji simulira nasumièno izvlaèenje karte iz špila od 52 karte. 
 * Program treba ispisati koja karta je izvuèena (A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q ili K) 
 * te znak u kojem je data karta (Srce, Pik, Djetelina, Kocka). 
 * Primjer: Karta koju ste izvukli je 10 u znaku kocke.
 * 
 */
package zadaci_19_01_2016;

public class Karte {

	public static void main(String[] args) {

		String[] naziv = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		String[] vrsta = { "Srce", "Pik", "Djetelina", "Kocka" };

		int pozicijaNaziv = 0;
		for (int i = 0; i < naziv.length; i++) {
			pozicijaNaziv = (int) (Math.random() * naziv.length); //daje slucajnu poziciju niza naziv
		}
		int pozicijaVrsta = 0;
		for (int i = 0; i < vrsta.length; i++) {
			pozicijaVrsta = (int) (Math.random() * vrsta.length); //daje slucajnu poziciju niza vrsta
		}
		System.out.println(naziv[pozicijaNaziv] + " " + vrsta[pozicijaVrsta]);

	}

}