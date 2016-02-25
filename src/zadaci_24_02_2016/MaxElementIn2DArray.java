/**(Maximum element in a two-dimensional array) Write a generic method that
returns the maximum element in a two-dimensional array.
public static <E extends Comparable<E>> E max(E[][] list)*/
package zadaci_24_02_2016;

public class MaxElementIn2DArray {

	public static <E extends Comparable<E>> E max(E[][] list) {
		E max = list[0][0];
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				if (list[i][j].compareTo(max) > 0) {
					max = list[i][j];
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {

		Integer[][] array = new Integer[3][3];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) (Math.random() * 100);
			}

		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Max is: "+max(array));

	}

}
