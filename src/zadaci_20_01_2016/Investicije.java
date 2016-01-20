/*Napisati program koji uèitava iznos investicije, godišnju interesnu stopu i broj godina te vraæa buduæu vrijednost 
investicije koristeæi se sljedeæom formulom: 

buducaVrijednostInvesticije = iznosInvesticije * (1 + mjesecnaInteresnaStopa)^brojGodina*12

Na primjer, ukoliko uneste kao iznos investicije 1000, 3.25 kao godišnju interesnu stopu i 1 kao broj godina 
program vam vraæa 1032.98 kao buducu vrijednost investicije.*/
package zadaci_20_01_2016;

import java.util.*;

public class Investicije {

	public static double stepenuj(double broj, int stepen) {// metoda za
															// stepenovanje
		double rezultat = 1;
		for (int i = 0; i < stepen; i++) {
			rezultat = rezultat * broj;
		}
		return rezultat;
	}

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite iznos investicije: ");
		double investicija = ulaz.nextDouble();
		System.out.println("Unesite godisnju interesnu stopu: ");
		double godisnjaStopa = ulaz.nextDouble();
		System.out.println("Godine: ");
		int brojGodina = ulaz.nextInt();

		double mjesecnaStopa = godisnjaStopa / 1200;

		double BInvesticija = investicija * (stepenuj(1 + mjesecnaStopa, brojGodina * 12));
		System.out.println(BInvesticija);

		ulaz.close();
	}

}
