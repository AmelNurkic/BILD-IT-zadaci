package zadaci_18_01_2016;

import java.util.*;

public class RasNaFaktore {
	public static List<Integer> rastaviNaFaktore(int broj) {
		List<Integer> brojevi = new ArrayList<Integer>();
		for (int i = 2; i <= broj; i++) {
			while (broj % i == 0) {
				brojevi.add(i);
				broj /= i;
			}
		}
		return brojevi;
	}

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite neki broj:");
		int broj;
		broj = ulaz.nextInt();
		for (Integer a : rastaviNaFaktore(broj)) {
			System.out.print(a + " ");
		}
		ulaz.close();
	}
}