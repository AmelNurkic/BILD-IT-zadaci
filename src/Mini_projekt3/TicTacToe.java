package MiniProjekt3;

import java.util.Scanner;

public class TicTacToe {

	public static void ispisi(char matrica[][]) {
		System.out.println("——————-——————");
		for (int i = 0; i < matrica.length; i++) {
			System.out.print("| ");
			for (int j = 0; j < matrica[i].length; j++) {
				System.out.print(matrica[i][j] + " | ");
			}
			System.out.println();
		}
		System.out.println("——————-——————");
	}

	// start copying http://www.coderslexicon.com/code/15/
	// Check three values to see if they are the same. If so, we have a winner.
	private static boolean tic_tac_toe_row(char chOne, char chTwo, char chThree) {
		if ((chOne == chTwo) && (chOne == chThree) && (chOne != 0 && chTwo != 0 && chThree != 0)) {
			return true;
		}
		return false;
	}

	// Check board for a win by looping through rows, columns and checking
	// diagonals.
	// If any of them are true, then there is a winning condition.

	private static boolean provjeraPobjednika(char[][] rijeci) {
		// Loop through the rows
		for (int i = 0; i < 3; i++) {
			if (tic_tac_toe_row(rijeci[i][0], rijeci[i][1], rijeci[i][2])) {
				return true;
			}
		}

		// Loop through the columns
		for (int i = 0; i < 3; i++) {
			if (tic_tac_toe_row(rijeci[0][i], rijeci[1][i], rijeci[2][i])) {
				return true;
			}
		}

		// Check diagonals
		if (tic_tac_toe_row(rijeci[0][0], rijeci[1][1], rijeci[2][2])) {
			return true;
		}

		if (tic_tac_toe_row(rijeci[0][2], rijeci[1][1], rijeci[2][0])) {
			return true;
		}

		return false;
	}

	private static boolean checkIfBusy(char matrica[][], int i, int j) {
		if (matrica[i][j] == 88 || matrica[i][j] == 79) {
			return true;
		}
		return false;
	}
	//end copying

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		char[][] rijeci = new char[3][3];
		int igrac = 1;
		iksoks: for (int i = 0; i < rijeci.length; i++) {
			for (int j = 0; j < rijeci[i].length; j++) {
				if (igrac % 2 != 0) {
					System.out.println("Unesite red 0,1,2 igrac X");
					int red = ulaz.nextInt();
					System.out.println("Unesite kolonu 0,1,2 igrac X");
					int kolona = ulaz.nextInt();
					while (red < 0 || red > 2 || kolona < 0 || kolona > 2) {
						System.out.println("Red i kolona moraju bit 0,1 ili 2. Pokusajte ponovo: ");
						System.out.println("Unesite red 0,1,2 igrac O");
						red = ulaz.nextInt();
						System.out.println("Unesite kolonu 0,1,2 igrac O");
						kolona = ulaz.nextInt();
					}
					while (checkIfBusy(rijeci, red, kolona)) {
						System.out.println("To polje je zauzeto, probajte neko drugo.");
						System.out.println("Unesite red 0,1,2 igrac O");
						red = ulaz.nextInt();
						System.out.println("Unesite kolonu 0,1,2 igrac O");
						kolona = ulaz.nextInt();
					}
					rijeci[red][kolona] = 88;
					ispisi(rijeci);
					igrac++;
					if (provjeraPobjednika(rijeci) == true) {
						System.out.println("Igrac X je pobjedio!");
						break iksoks;
					}
				} else if (igrac % 2 == 0) {
					System.out.println("Unesite red 0,1,2 igrac O");
					int red = ulaz.nextInt();
					System.out.println("Unesite kolonu 0,1,2 igrac O");
					int kolona = ulaz.nextInt();
					while (red < 0 || red > 2 || kolona < 0 || kolona > 2) {
						System.out.println("Red i kolona moraju bit 0,1 ili 2. Pokusajte ponovo: ");
						System.out.println("Unesite red 0,1,2 igrac O");
						red = ulaz.nextInt();
						System.out.println("Unesite kolonu 0,1,2 igrac O");
						kolona = ulaz.nextInt();
					}
					while (checkIfBusy(rijeci, red, kolona)) {
						System.out.println("To polje je zauzeto, probajte neko drugo.");
						System.out.println("Unesite red 0,1,2 igrac O");
						red = ulaz.nextInt();
						System.out.println("Unesite kolonu 0,1,2 igrac O");
						kolona = ulaz.nextInt();
					}
					rijeci[red][kolona] = 79;
					ispisi(rijeci);
					igrac++;
					if (provjeraPobjednika(rijeci) == true) {
						System.out.println("Igrac O je pobjedio!");
						break iksoks;
					}
				}
			}

		}

	}
}
