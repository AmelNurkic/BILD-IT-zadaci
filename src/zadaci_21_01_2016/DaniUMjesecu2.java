package zadaci_21_01_2016;

import java.util.*;

public class DaniUMjesecu2 {

	public static boolean prestupna(int godina) {
		if (((godina % 4 == 0) && (godina % 100 != 0)) || (godina % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}

	public static void brojDanaUMjesecu2(String mjesec, int godina) {
		
		if ((mjesec.matches("Feb")) && (prestupna(godina)))
			System.out.println("Mjesec ima 29 dana.");
		if (mjesec.matches("Jan"))
			System.out.println("Mjesec ima 31 dan.");
		if (mjesec.matches("Feb")&&(prestupna(godina)==false))
			System.out.println("Mjesec ima 28 dana.");
		if (mjesec.matches("Mar"))
			System.out.println("Mjesec ima 31 dan.");
		if (mjesec.matches("Apr"))
			System.out.println("Mjesec ima 30 dana.");
		if (mjesec.matches("Maj"))
			System.out.println("Mjesec ima 31 dan.");
		if (mjesec.matches("Jun"))
			System.out.println("Mjesec ima 30 dana.");
		if (mjesec.matches("Jul"))
			System.out.println("Mjesec ima 31 dan.");
		if (mjesec.matches("Aug"))
			System.out.println("Mjesec ima 31 dan.");
		if (mjesec.matches("Sep"))
			System.out.println("Mjesec ima 30 dana.");
		if (mjesec.matches("Okt"))
			System.out.println("Mjesec ima 31 dan.");
		if (mjesec.matches("Nov"))
			System.out.println("Mjesec ima 30 dan.");
		if (mjesec.matches("Dec"))
			System.out.println("Mjesec ima 31 dan.");
	}

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite mjesec: ");
		String mjesec = ulaz.nextLine();
		System.out.println("Unesite godinu: ");
		int godina = ulaz.nextInt();

		brojDanaUMjesecu2(mjesec, godina);
		ulaz.close();
	}

}
