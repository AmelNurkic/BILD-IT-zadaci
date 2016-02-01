/**Napisati program koji uèitava 10 brojeva te ispisuje koilko je jedinstvenih brojeva unijeto te sve jedinstvene brojeve 
 * koji su unijeti, razmaknute jednim spaceom. 
 * Ukoliko se neki broj pojavljuje više puta, broj treba ispisati samo jednom.*/
package zadaci_01_02_2016;

import java.util.*;

public class JedinstveniBrojevi {

	public static Integer[] removeDuplicates(Integer[] arr) {
		return new HashSet<Integer>(Arrays.asList(arr)).toArray(new Integer[0]);
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		// unos 10 brojeva od korisnika
		int[] a = new int[10];
		System.out.println("Unesite 10 brojeva: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = ulaz.nextInt();
		}
		// sortiranje liste kako bi sve iste postavili jedne do drugih
		Arrays.sort(a);
		ArrayList<Integer> jedBrojevi = new ArrayList<Integer>();
		// ako su isti dodaj ih u listu jedBrojevi
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != a[i + 1]) {
				jedBrojevi.add(a[i]);
			}
		}
		// ako su prvi i zadnji clan isti dodaj ga u listu
		if (a[0] != a[a.length - 1]) {
			jedBrojevi.add(a[a.length - 1]);
		}
		// ispisi sve jedinsvene brojeve
		for (int i : jedBrojevi) {
			System.out.print(i + " ");
		}
		ulaz.close();

	}

}
