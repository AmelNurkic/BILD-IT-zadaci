/*
Napisati sljedeæu metodu koja vraæa najveæu vrijednosti u ArrayListu Integera. 
Metoda vraæa null ukoliko je lista null iil ukoliko lista sadrži 0 elemenata.
public static Integer max(ArrayList<Integer> list)
 */
package zadaci_15_01_2016;

import java.util.ArrayList;

public class ArrayLista {

	public static void main(String[] args) {
		ArrayList test = new ArrayList();
		test.add(2);
		test.add(3);
		test.add(99);
		System.out.println(max(test));
	}

	public static Integer max(ArrayList<Integer> list) {
		if (list.isEmpty()) {  //ukoliko je lista prazna vrati null
			return null;
		}
		int max = Integer.MIN_VALUE; //uvodimo int max i za pocetak mu dodjeljujemo najmanju vrijednost od liste
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > max) { //ukoliko je slijedeci clan liste veci od max onda max postaje vrijednost tog clana
				max = list.get(i);
			}

		}
		return max;

	}

}
