/*Napisati metodu koja broji slova u stringu. Metoda treba koristiti sljedeæi header: 

public static int countLetters(String s)

Napisati program koji pita korisnika da unese neki string te mu vrati koliko taj string ima slova.*/
package zadaci_19_01_2016;

import java.util.*;

public class BrojacSlova {
	
	public static int countLetters(String s){
		int brojac=0;
		for(int i = 0; i<s.length();i++)
			if((s.charAt(i)>64 && s.charAt(i)<91)||(s.charAt(i)>96 && s.charAt(i)<123))
				// po ASCII tabeli znakovi 65-90 su velika slova a 97-122 su velika slova
				brojac++;
		return brojac;
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite rijec: ");
		String rijec = ulaz.nextLine();
		System.out.println("Broj slova u stringu koji ste unijeli je: "+countLetters(rijec));

		
		ulaz.close();
	}

}
