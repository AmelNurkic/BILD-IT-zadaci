/* Napisati metodu koja izraèunava zbir svih brojeva u cijelom broju. Koristite sljedeæi header: public static int sumDigits(long n). 
 * Na primjer, ako pozovemo metodu i proslijedimo joj broj 234 (sumDigits(234)) metoda treba da vrati 9. (2 + 3 + 4 = 9)*/
package zadaci_29_01_2016;

public class ZbirCifara {

	public static int zbirCifri(int broj) {
		int zbir = 0;
		while (broj > 0) {
			zbir = zbir + broj % 10;
			broj = broj / 10;
		}
		return zbir;
	}

	public static void main(String[] args) {

		System.out.println(zbirCifri(234));

	}

}
