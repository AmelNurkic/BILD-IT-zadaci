/*Pretpostavimo da uplatimo $100 svaki mjesec na �tedni ra�un koji ima godi�nju interesnu stopu od 5%. 
 * Mjese�na interesna stopa je stoga 0.05 / 12 = 0.00417. 
 * Nakon prvog mjeseca vrijednost na ra�unu postaje 100 * (1 + 0.00417) = 100.417. 
 * Nakon drugog mjeseca, vrijednost na ra�unu postaje (100 + 100.417) * (1 + 0.00417) = 201.252. 
 * Nakon tre�eg mjeseca, vrijednost na ra�unu postaje (100 + 201.252) * (1 + 0.00417) = 302.507 i tako dalje. 
 * Napisati program koji pita korisnika da unese mjese�ni iznos �tednje te broj mjeseci nakon kojeg bi �elio znati 
 * stanje ra�una. 
 * 
 */
package zadaci_19_01_2016;

import java.util.*;

public class Stednja {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);
		double iznosStednje = 0;
		int brojMjeseci = 0;
		System.out.println("Unesite iznos stednje: ");
		iznosStednje = ulaz.nextDouble();
		System.out.println("Unesite broj mjeseci: ");
		brojMjeseci = ulaz.nextInt();
		double mjesecnaStopa = 0;
		System.out.println("Unesite mjesecnu stopu: ");
		mjesecnaStopa = ulaz.nextDouble();
		double MIS = mjesecnaStopa / brojMjeseci; // mjesecna interesna stopa
		double stednja = 0;
		for (int i = 0; i < brojMjeseci; i++) {
			stednja = (iznosStednje + stednja) * (1 + MIS);
			// prvi put ce bit (100+0)*(1+0.00417) = 100.417
			// drugi put (100 + 100.417)*(1+0.00417) = 201.252 itd
		}
		System.out.println("Stanje racuna nakon svih uplata: " + stednja);
		ulaz.close();

	}

}