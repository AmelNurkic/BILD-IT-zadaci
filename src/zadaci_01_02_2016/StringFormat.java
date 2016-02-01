/**Napisati metodu sa sljede�im headerom: public static String format(int number, int width) koja vra�a string broja sa 
 * prefiksom od jedne ili vi�e nula. Veli�ina stringa je width argument. 
 * Na primjer, ukoliko pozovemo metodu format(34, 4) metoda vra�a 0034, ukoliko pozovemo format(34, 5) metoda vra�a 00034. 
 * Ukoliko je uneseni broj ve�i nego width argument, metoda vra�a samo string broja. 
 * Npr. ukoliko pozovemo format(34, 1) metoda vra�a 34.*/
package zadaci_01_02_2016;

public class StringFormat {

	public static String format(int number, int width) {
		String a = "" + number;
		while (a.length() < width) {
			a = "0" + a;
		}
		return a;
	}

	public static void main(String[] args) {
		System.out.println(format(34,5));

	}

}
