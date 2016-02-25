/**(Maximum element in an array) Implement the following method that returns the
maximum element in an array.
public static <E extends Comparable<E>> E max(E[] list)*/
package zadaci_24_02_2016;

public class MaxElementInArray {

	public static <E extends Comparable<E>> E max(E[] list) {
		// max is first element in list
		E max = list[0];
		// going throught list and if element in list is bigger than max give
		// max that value
		for (int i = 0; i < list.length; i++) {
			if (list[i].compareTo(max) > 0) {
				max = list[i];
			}

		}
		return max;
	}

	public static void main(String[] args) {

		Integer[] list = new Integer[5];
		for (int i = 0; i < 5; i++) {
			list[i] = (int) (Math.random() * 100);
		}
		for (int i : list) {
			System.out.print(i + " ");
		}
		System.out.println("\nMax is: " + max(list));

	}

}
