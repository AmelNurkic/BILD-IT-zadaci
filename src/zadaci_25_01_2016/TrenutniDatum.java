/*Ako pozovemo metodu System.currentTimeMillis() dobijemo broj milisekundi od 1. januara 1970 do trenutka pozivanja metode. 
 * Napisati program koji ispisuje trenutaèni datum i vrijeme u formatu "Trenutni datum i vrijeme: 22. juli, 2015 19:59:47"*/
package zadaci_25_01_2016;

import java.util.Calendar;
import java.util.TimeZone;

public class TrenutniDatum {

	public static void main(String[] args) {

		Calendar kalendar = Calendar.getInstance(TimeZone.getTimeZone("Europe/Sarajevo"));
		kalendar.setTimeInMillis(System.currentTimeMillis());

		int godina = kalendar.get(Calendar.YEAR);
		int mjesec = kalendar.get(Calendar.MONTH);
		String[] mjeseci = { "januar", "februar", "mart", "april", "maj", "juni", "juli", "august", "septembar",
				"oktobar", "novembar", "decembar" };
		int dan = kalendar.get(Calendar.DAY_OF_MONTH);
		int sat = kalendar.get(Calendar.HOUR_OF_DAY);
		int minuta = kalendar.get(Calendar.MINUTE);
		int sekunda = kalendar.get(Calendar.SECOND);

		System.out.println(dan + ". " + mjeseci[mjesec] + ", " + godina + " " + sat + ":" + minuta + ":" + sekunda);

	}

}
