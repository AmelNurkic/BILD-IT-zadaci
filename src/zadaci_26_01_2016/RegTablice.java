package zadaci_26_01_2016;

import java.util.ArrayList;

public class RegTablice {

	public static char slucajnoVS() {
		// metoda koja nam daje jedno veliko slovo
		ArrayList<Character> velikaSlova = new ArrayList<Character>();
		for (int i = 65; i <= 90; i++) {
			velikaSlova.add((char) i);
		}
		int slucajanIndeks = (int) (Math.random() * velikaSlova.size());
		char velikoSlovo = velikaSlova.get(slucajanIndeks);
		return velikoSlovo;
	}

	// metoda koja vraca jedan broj 0-9
	public static int slucajanBroj() {
		int a = (int) (Math.random() * 10);
		return a;
	}

	public static void main(String[] args) {
		char a = slucajnoVS();
		char b = slucajnoVS();
		char c = slucajnoVS();
		int d = slucajanBroj();
		int e = slucajanBroj();
		int f = slucajanBroj();
		int g = slucajanBroj();

		// "" sluzi da bi eclipse skuzio da je u pitanju String, sreca ovo mi
		// nije oduzelo ni sat vremena.
		System.out.println("" + a + b + c + "-" + d + e + f + g);

	}

}
