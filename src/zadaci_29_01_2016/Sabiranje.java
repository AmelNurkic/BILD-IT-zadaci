/*Napisati program koji sabira sljedeæu seriju 1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 ..... + 95/97 + 97/99.*/
package zadaci_29_01_2016;

public class Sabiranje {

	public static void main(String[] args) {
		double zbir = 0;
		for (double i = 1; i < 98; i++) {
			if (i % 2 != 0) {
				double razlomak = i / (i + 2);
				zbir = zbir + razlomak;
			}
		}

		System.out.println("Zbir serije 1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 ..... + 95/97 + 97/99 je " + zbir);
	}

}
