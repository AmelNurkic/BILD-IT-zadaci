/*Napisati program koji nasumièno generiše cijeli broj izmeðu 1 i 12 te ispisuje ime mjeseca za taj broj. 
 * (Januar za 1, Ferbruar za 2....)*/
package zadaci_29_01_2016;

public class Mjeseci {

	public static String dajMjesec(int a) {
		switch (a) {
		case 1:
			return "Januar";
		case 2:
			return "Februar";
		case 3:
			return "Mart";
		case 4:
			return "April";
		case 5:
			return "Maj";
		case 6:
			return "Juni";
		case 7:
			return "Juli";
		case 8:
			return "August";
		case 9:
			return "Septembar";
		case 10:
			return "Oktobar";
		case 11:
			return "Novembar";
		case 12:
			return "Decemabr";

		}
		return "Broj mora biti 1-12";
	}

	public static void main(String[] args) {
		System.out.println(dajMjesec(13));

	}

}
