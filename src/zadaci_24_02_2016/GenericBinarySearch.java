/**(Generic binary search) Implement the following method using binary search.
public static <E extends Comparable<E>>
int binarySearch(E[] list, E key)*/
package zadaci_24_02_2016;

public class GenericBinarySearch {

	public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {
		int low = 0;
		int high = list.length - 1;
		while (high >= low) {
			int mid = (high + low) / 2;
			if (list[mid].compareTo(key) == 0) {
				return mid;
			}
			if (list[mid].compareTo(key) > 0) {
				high = mid - 1;
			}
			if (list[mid].compareTo(key) < 0) {
				low = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Integer[] array = new Integer[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
			System.out.print(array[i] + " ");
		}
		System.out.println("\n" + binarySearch(array, 6));

	}

}
