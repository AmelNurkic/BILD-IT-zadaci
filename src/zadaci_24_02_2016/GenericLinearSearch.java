/**(Generic linear search) Implement the following generic method for linear search.
public static <E extends Comparable<E>>
int linearSearch(E[] list, E key)*/
package zadaci_24_02_2016;

public class GenericLinearSearch {

	public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {
		for (int i = 0; i < list.length; i++) {
			// going through array looking for key, and if there it is return
			// its index at array
			if (list[i].compareTo(key) == 0) {
				return i;
			}
		}
		// if there is no result return -1
		return -1;
	}

	public static void main(String[] args) {

		String[] array = { "jedan", "dva", "tri" };
		System.out.println(linearSearch(array, "dva"));
		System.out.println(linearSearch(array, "pet"));

	}

}
