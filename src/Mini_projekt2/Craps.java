package Mini_projekt2;

public class Craps {

	public static void main(String[] args) {

		int a = (int) (Math.random() * 6);
		int b = (int) (Math.random() * 6);
		int c = a + b;
		if (c == 2 || c == 3 || c == 12) {
			System.out.println("Izvukli ste " + a + " + " + b + " = " + c);
			System.out.println("Izgubili ste.");
		} else if (c == 7 || c == 11) {
			System.out.println("Izvukli ste " + a + " + " + b + " = " + c);
			System.out.println("Pobjedili ste.");
		} else
			System.out.println("Izvukli ste " + a + " + " + b + " = " + c);
		System.out.println("Poentiranje je: " + c);
		a = (int) (Math.random() * 6);
		b = (int) (Math.random() * 6);
		int d = a + b;
		System.out.println("Izvukli ste: " + a + " + " + b + " = " + d);
		while (d != 7) {
			if (c == d) {
				System.out.println("Pobjedili ste !");
				break;
			} else {
				System.out.println("Poentiranje je: " + c);
			}
			a = (int) (Math.random() * 6);
			b = (int) (Math.random() * 6);
			d = a + b;
			System.out.print("Izvukli ste: " + a + " + " + b + " = " + d);
			System.out.println();
		}
		if (d == 7) {
			System.out.println("Izgubili ste !");
		}

	}

}
