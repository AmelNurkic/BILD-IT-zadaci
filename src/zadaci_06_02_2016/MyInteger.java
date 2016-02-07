/**(The MyInteger class) Design a class named MyInteger. The class contains:
■ An int data field named value that stores the int value represented by this
object.
■ A constructor that creates a MyInteger object for the specified int value.
■ A getter method that returns the int value.
■ The methods isEven(), isOdd(), and isPrime() that return true if the
value in this object is even, odd, or prime, respectively.
■ The static methods isEven(int), isOdd(int), and isPrime(int) that
return true if the specified value is even, odd, or prime, respectively.
■ The static methods isEven(MyInteger), isOdd(MyInteger), and
isPrime(MyInteger) that return true if the specified value is even, odd,
or prime, respectively.
■ The methods equals(int) and equals(MyInteger) that return true if
the value in this object is equal to the specified value.
■ A static method parseInt(char[]) that converts an array of numeric
characters to an int value.
■ A static method parseInt(String) that converts a string into an int
value.
Draw the UML diagram for the class and then implement the class. Write a client
program that tests all methods in the class.*/
package zadaci_06_02_2016;

public class MyInteger {
	// osobine
	private int value;

	// konstruktori
	public MyInteger(int value) {
		this.value = value;
	}

	// metode
	public int getValue() {
		return value;
	}

	public boolean isEven() {
		if (value % 2 == 0) {
			return true;
		}
		return false;
	}

	public boolean isOdd() {
		if (value % 2 != 0) {
			return true;
		}
		return false;
	}

	public boolean isPrime() {
		for (int i = 2; i < value; i++) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}

	// sa int
	public static boolean isEven(int a) {
		if (a % 2 == 0) {
			return true;
		}
		return false;
	}

	public static boolean isOdd(int a) {
		if (a % 2 != 0) {
			return true;
		}
		return false;
	}

	public static boolean isPrime(int a) {
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

	public boolean isEven(MyInteger a) {
		return MyInteger.isEven(a.getValue());
	}

	public boolean isOdd(MyInteger a) {
		return MyInteger.isOdd(a.getValue());
	}

	public boolean isPrime(MyInteger a) {
		return MyInteger.isPrime(a.getValue());
	}

	public boolean equals(int a) {
		return value == a;
	}

	public boolean equals(MyInteger a) {
		return equals(a.getValue());
	}

	public static int parseInt(char[] chars) {
		return parseInt(new String(chars));
	}
	public static int parseInt(String a) {
		return Integer.parseInt(a);
	}

}
