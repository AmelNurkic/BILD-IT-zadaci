/**Napisati metodu sa sljedeæim headerom: public static String format(int number, int width) koja vraæa string broja sa 
 * prefiksom od jedne ili više nula. Velièina stringa je width argument. 
 * Na primjer, ukoliko pozovemo metodu format(34, 4) metoda vraæa 0034, ukoliko pozovemo format(34, 5) metoda vraæa 00034. 
 * Ukoliko je uneseni broj veæi nego width argument, metoda vraæa samo string broja. 
 * Npr. ukoliko pozovemo format(34, 1) metoda vraæa 34.*/
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
