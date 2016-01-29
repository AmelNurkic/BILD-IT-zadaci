/*Napisati program koji igra sa protivnikom Kamen-Papir-Makazes (papir-bunar-makaze ili tako nekako po naški). 
 * Program nasumièno generiše brojeve 0, 1 i 2 koji predstavljaju papir, bunar i makaze. 
 * Program pita korisnika da unese 0, 1 ili 2 te mu ispisuje poruku da li je korisnik pobijedio, 
 * da li je raèunar pobijedio ili je bilo neriješeno*/
package zadaci_29_01_2016;

import java.util.*;

public class RPC {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Izberite: ");
		System.out.println("0 - kamen ");
		System.out.println("1 - papir");
		System.out.println("2 - makaze ");
		int a = ulaz.nextInt();
		int b = (int) (Math.random() * 2) + 1;
		if (b == 0) {
			if (a == 0) {
				System.out.println("Kamen - Kamen: NERIJESENO");
			} else if (a == 1) {
				System.out.println("Papir - Kamen: POBJEDILI STE!");
			} else if (a == 2) {
				System.out.println("Makaze - Kamen: IZGUBILI STE!");
			}
		} else if (b == 1) {
			if (a == 0) {
				System.out.println("Kamen - Papir: IZGUBILI STE!");
			} else if (a == 1) {
				System.out.println("Papir - Papir: NERIJESENO");
			} else if (a == 2) {
				System.out.println("Makaze - Papir: POBJEDILI STE!");
			}

		} else if (b == 2) {
			if (a == 0) {
				System.out.println("Kamen - Makaze: POBJEDILI STE!");
			} else if (a == 1) {
				System.out.println("Papir - Makaze: IZGUBILI STE!");
			} else if (a == 2) {
				System.out.println("Makaze - Makaze: NERIJESENO");
			}
		}
		ulaz.close();
	}

}
