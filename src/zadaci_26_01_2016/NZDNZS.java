/* Napisati program koji pita korisnika da unese dva cijela, pozitivna broja 
te ispisuje najveæi i najmanji zajednièki djelilac za ta dva broja.*/
package zadaci_26_01_2016;

import java.util.*;

public class NZDNZS {

	public static int NajmanjiZD(int a, int b) {
		ArrayList<Integer> najZD = new ArrayList<Integer>();
		int manji;
		int veci;
		// pronalazimo koji je broj veci od dva unesena
		if (a < b) {
			manji = a;
			veci = b;
		} else {
			manji = b;
			veci = a;
		}
		// posto je svaki cijeli pozitivni broj djeljiv sa 1 "i" pocinje od 2 pa
		// do veceg broja jer je to i najveci moguci djelilac
		for (int i = 2; i <= veci; i++) {
			if (manji % i == 0 && veci % i == 0) {
				najZD.add(i);
			}
		}
		// ako je lista prazna brojevi nemaju zajednickog djelioca
		if (najZD.isEmpty()) {
			return 0;
		}
		// sortiranje liste od najmanjeg do najveceg
		Collections.sort(najZD);
		// vracanje najmanjeg tj. prvog u listi
		return najZD.get(0);
	}

	// za pronalazenje najveceg djelioca sam koristio istu metodu samo sam
	// vratio zadnji clan umjesto prvog u listi
	public static int NajveciZD(int a, int b) {
		ArrayList<Integer> najZD = new ArrayList<Integer>();
		int manji;
		int veci;
		if (a < b) {
			manji = a;
			veci = b;
		} else {
			manji = b;
			veci = a;
		}
		for (int i = 2; i <= veci; i++) {
			if (manji % i == 0 && veci % i == 0) {
				najZD.add(i);
			}
		}
		if (najZD.isEmpty()) {
			return 0;
		}
		Collections.sort(najZD);
		return najZD.get(najZD.size() - 1);
	}

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);
		int a = -1;
		int b = -1;
		while (a < 0 || b < 0) {
			System.out.println("Unesite dva pozitivna broja: ");
			a = ulaz.nextInt();
			b = ulaz.nextInt();
		}
		int najveciZD = NajveciZD(a, b);
		int najmanjiZD = NajmanjiZD(a, b);
		if (najmanjiZD == 0) {
			System.out.println("Brojevi " + a + " i " + b + " nemaju zajednickog djelioca.");
		} else if (najmanjiZD == najveciZD) {
			System.out.println("Brojevi imaju samo jedan zajednicki djelilac: " + najmanjiZD);
		}

		else {
			System.out.println("Za brojeve: " + a + " i " + b + " najveci zajednicki djelilac je " + najveciZD);
			System.out.println("Za brojeve: " + a + " i " + b + " najmanji zajednicki djelilac je " + najmanjiZD);
		}
		ulaz.close();

	}

}
