/** Napisati metodu koja vraæa datum i trenutaèno vrijeme*/
package zadaci_30_01_2016;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class TrenutnoVrijeme {
	public static void dajVrijeme() {
		Calendar kalendar = Calendar.getInstance(TimeZone.getTimeZone("Europe/Sarajevo"));
		SimpleDateFormat izgled = new SimpleDateFormat("dd MMM yyy HH:mm:ss");
		System.out.println(izgled.format(kalendar.getTime()));
	}

	public static void main(String[] args) {
		dajVrijeme();

	}

}
