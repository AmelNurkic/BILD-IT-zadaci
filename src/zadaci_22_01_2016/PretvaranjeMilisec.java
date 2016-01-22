/*Napisati metodu koja pretavara milisekunde u sate, minute i sekunde. Metoda treba da koristi sljedeæi header: 
 * public static String convertMillis(long millis). 
 * Metoda treba da vraæa vrijeme kao string u formatu sati:minute:sekunde. 
 * Na primjer convertMillis(100000) treba da vrati 0:1:40.*/
package zadaci_22_01_2016;

public class PretvaranjeMilisec {

	public static String convertMillis(long millis) {

		long sekunde = (millis / 1000) % 60;
		long minute = (millis / (1000 * 60)) % 60;
		long sati = (millis / (1000 * 60 * 60)) % 24;

		String vrijeme = sati + ":" + minute + ":" + sekunde;
		return vrijeme;

	}

	public static void main(String[] args) {

		System.out.println(convertMillis(100000));

	}

}
