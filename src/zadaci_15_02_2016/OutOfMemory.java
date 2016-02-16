/**(OutOfMemoryError) Write a program that causes the JVM to throw an
OutOfMemoryError and catches and handles this error.*/
package zadaci_15_02_2016;

public class OutOfMemory {

	public static void main(String[] args) {
		int max = Integer.MAX_VALUE;
		int divisor = 10;
		boolean isOK = true;
		do {
			try {
				System.out.println("Trying to allocate " + max + " bytes");
				byte[] bytes = new byte[max];
				System.out.println("Successfull!");
				isOK = false;

			} catch (OutOfMemoryError ex) {
				System.out.println("Unsuccessful. Trying again ...");
				max = max / divisor;
			}
		} while (isOK);

	}

}
