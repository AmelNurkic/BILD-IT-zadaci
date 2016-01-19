package zadaci_19_01_2016;

import java.util.Scanner;

public class ObrnutRedoslijed {

	public static void main(String[] args) {
		int[] niz = new int[10]; 
		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite 10 brojeva");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = ulaz.nextInt(); 

		}
		for (int i = niz.length - 1; i >= 0; i--)
			System.out.print(niz[i] + " "); 
		ulaz.close();
	}

}