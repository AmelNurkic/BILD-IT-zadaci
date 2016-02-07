package zadaci_06_02_2016;

public class MyIntegerTest {

	public static void main(String[] args) {
		MyInteger someNumber = new MyInteger(5);
		System.out.println("5 is even? " + someNumber.isEven());
		System.out.println("10 is prime? " + MyInteger.isPrime(10));
		System.out.println("5 number is prime? " + someNumber.isPrime());
		MyInteger someNumber2 = new MyInteger(73);
		System.out.println("Is 5 equal to 73? " + someNumber.equals(someNumber2));
		System.out.println("73 is odd? " + someNumber2.isOdd());
		System.out.println("5 is equal to 5? " + someNumber.equals(5));
		System.out.println("58 is odd? " + MyInteger.isOdd(58));

		String s = "1234";
		System.out.println(MyInteger.parseInt(s));

		char[] chars = { '9', '9', '9' };
		System.out.println(MyInteger.parseInt(chars));

	}

}
