/*Neke web stranice forsiraju odreðena pravila za passworde. 
 * Napisati metodu koja provjerava da li je unijeti string validan password. 
 * Pravila da bi password bio validan su sljedeæa: 
 * 1. Password mora biti saèinjen od najmanje 8 karaktera. 
 * 2. Password smije da se sastoji samo od slova i brojeva. 
 * 3. Password mora sadržati najmanje 2 broja. 
 * Napisati program koji pita korisnika da unese password te mu ispisuje "password je validan" ukoliko su sva 
 * pravila ispoštovana ili "password nije validan" ukoliko pravila nisu ispoštovana.*/
package zadaci_21_01_2016;

public class Password {

	public static boolean duzinaPassworda(String password) {// provjerava je li
															// password duzi od
															// 8 karaktera
		if (password.length() > 7)
			return true;
		return false;
	}

	public static boolean SBPassword(String password) { // provjerava je li
														// password slovo ili
														// broj
		char[] znak = password.toCharArray();
		for (int i = 0; i < password.length(); i++) {
			if ((znak[i] >= 65 && i <= 90) || (znak[i] >= 97 && i <= 122) || (znak[i] >= 48 && i <= 57)) {
				return true;
			}
		}
		return false;
	}

	public static boolean dvaBroja(String password) { // provjerava ima li 2
														// broja u passwordu
		char[] znak = password.toCharArray();
		int brojac = 0;
		for (int i = 0; i < password.length(); i++) {
			if (znak[i] >= 48 && znak[i] <= 57) {
				brojac++;
			}
		}
		if (brojac > 1) {
			return true;

		}
		return false;
	}

	public static void main(String[] args) {
		String password = "amel0308";
		if ((duzinaPassworda(password)) && (SBPassword(password)) && (dvaBroja(password))) {
			System.out.println("Password ispravan.");
		} else {
			System.out.println("Neispravan password.");
		}

	}

}
