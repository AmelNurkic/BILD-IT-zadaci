/**(Pattern recognition: consecutive four equal numbers) Write the following
method that tests whether the array has four consecutive numbers with the same
value.
public static boolean isConsecutiveFour(int[] values)
*/
package zadaci_02_02_2016;

public class ConsecutiveFour {

	public static boolean isConsecutiveFour(int[] values) {
		int counter = 1;
		for (int i = 0; i < values.length - 1; i++) {
			if (values[i] == values[i + 1]) {
				counter++;
				if (counter == 4) {
					return true;
				}
			}
		}
		return false;

	}

	public static void main(String[] args) {
		int[] numbers = { 3, 4, 5, 5, 5, 5, 4, 5 };
		int[] numbers2 ={3, 4, 5, 5, 6, 5, 5, 4, 5};
		System.out.println(isConsecutiveFour(numbers));
		System.out.println(isConsecutiveFour(numbers2));

	}

}
