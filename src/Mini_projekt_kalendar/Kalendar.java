package Mini_projekt_kalendar;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Kalendar {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner ulaz = new Scanner(System.in);

		int a = 0;
		while (a < 1 || a > 3) {
			System.out.println("1 KALENDAR: ");
			System.out.println("2 DODAJ NAPOMENU: ");
			System.out.println("3 POGLEDAJ NAPOMENE: ");
			a = ulaz.nextInt();
		}
		if (a == 1) {
			System.out.println("Unesite godinu: ");
			int godina = ulaz.nextInt();
			System.out.println("Unesite mjesec: ");
			int mjesec = ulaz.nextInt();

			Calendar kalendar = new GregorianCalendar(godina, mjesec, 0);
			String[] nazivMjeseca = { "", "Januar", "Februar", "Mart", "April", "Maj", "Juni", "Juli", "August",
					"Septembar", "Oktobar", "Novembar", "Decembar" };

			System.out.println("    " + nazivMjeseca[mjesec] + " " + godina);
			System.out.println("Ne Po Ut Sr Ce Pe Su");
			int h = (1 + (int) (((mjesec + 1) * 26) / 10.0) + godina + (int) (godina / 4.0) + 6 * (int) (godina / 100.0)
					+ (int) (godina / 400.0)) % 7;
			for (int i = 0; i < h - 1; i++)
				System.out.print("   ");
			for (int i = 1; i <= kalendar.getActualMaximum(kalendar.DAY_OF_MONTH); i++) {
				System.out.printf("%2d ", i);
				if (((i + h - 1) % 7 == 0) || (i == kalendar.getActualMaximum(kalendar.DAY_OF_MONTH)))
					System.out.println();
			}
			ulaz.close();

		} else if (a == 2) {
			Scanner ulaz1 = new Scanner(System.in);
			Calendar kalendar = Calendar.getInstance();
			kalendar.clear();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
			System.out.println("Unesite napomenu: ");
			String napomena = ulaz1.nextLine();
			System.out.println("Unesite mjesec: ");
			int mjesec = ulaz1.nextInt();
			System.out.println("Unesite godinu: ");
			int godina = ulaz1.nextInt();
			System.out.println("Unesite datum: ");
			int dan = ulaz1.nextInt();

			kalendar.set(godina, mjesec - 1, dan);

			try {
				File fajl = new File("src\\napomene.txt");

				FileWriter pisac = new FileWriter(fajl, true);
				pisac.write(dateFormat.format(kalendar.getTime()) + " " + napomena);
				pisac.write(System.getProperty("line.separator"));
				pisac.close();

			} catch (IOException IO) {
				IO.printStackTrace();
			}
			System.out.println("Vasa napomena je dodana");

		} else if (a == 3) {
			Scanner ulaz2 = new Scanner(System.in);
			BufferedReader citac = null;

			try {

				String string;

				citac = new BufferedReader(new FileReader("src\\napomene.txt"));

				while ((string = citac.readLine()) != null) {
					System.out.println(string);
				}

			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (citac != null)
						citac.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}

		}
	}
}