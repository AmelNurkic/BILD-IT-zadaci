package zadaci_19_01_2016;

import java.util.*;

public class ZajednickiPrefix {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite prvu rijec: ");
		String rijec1 = ulaz.nextLine();
		System.out.println("Unesite drugu rijec: ");
		String rijec2 = ulaz.nextLine();
		
		//Ukoliko prvi char nije isti onda rijeci nemaju zajednickog prefiksa
		if (rijec1.charAt(0) != rijec2.charAt(0))
			System.out.println("Rijec " + rijec1 + " i rijec " + rijec2 + " nemaju zajednickog prefiksa");
		
		System.out.println("Zajednicki prefiks za dvije rijeci koje ste unijeli je: ");
		for (int i = 0; i < rijec1.length(); i++) {
		if (rijec1.charAt(i) == rijec2.charAt(i)) { //Ako su char-ovi na istim pozicijama u rijecima isti ispisi ih
				System.out.print(rijec1.charAt(i));
			}
		}
		ulaz.close();
	}
}
