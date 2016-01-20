package zadaci_20_01_2016;

import java.util.*;

public class ReverseAndPalindrom {

	public static int obrni(int broj) {
		int obrnut = 0;
		while (broj != 0) {
			obrnut = obrnut * 10;
			obrnut = obrnut + broj % 10;
			broj = broj / 10;
		}
		return obrnut;
	}

	public static boolean jeLiPalindrom(int broj) {
		if (broj == obrni(broj))
			return true;
		return false;
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite broj: ");
		int a = ulaz.nextInt();
		if (jeLiPalindrom(a) == true) {
			System.out.println("Broj koji ste unijeli je palindrom.");
		} else {
			System.out.println("Broj koji ste unijeli nije palindrom");
		}
		ulaz.close();
	}

}
