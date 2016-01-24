/*Napisati metodu koja pronalazi broj ponavljanja odreðenog karaktera u stringu. 
 * Metoda treba da koristi sljedeæi header: public static int count(String str, char a). 
 * Na primjer, ukoliko pozovemo metodu na sljedeæi naèin: count("Welcome", e) metoda treba da vrati 2. 
 * Napisati program koji pita korisnika da unese string i koji karakter želi da prebroji u datom stringu 
 * te mu ispiše koliko se puta odreðeni karakter ponovio u zadatom stringu.*/
package zadaci_24_01_2016;

import java.util.Scanner;

public class BrojSlovaUStringu {
	
	 public static int count(String str, char a){
		 char[] niz = str.toCharArray();
		 int brojac=0;
		 for(int i=0; i<str.length();i++){
			 if (niz[i]==a){
				 brojac++;
			 }
		 }
		return brojac;
	 }

	public static void main(String[] args) {
		
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite rijec: ");
		String rijec = ulaz.next();
		String slovo = "AA";
		//Ako korisnik pogreskom unese vise slova ponavljaj pitanje
		while (slovo.length()>1){
			System.out.println("Unesite slovo: ");
			slovo = ulaz.next();
		}
		char[] niz = slovo.toCharArray();
		
		System.out.println("U rijeci "+rijec+" slovo "+slovo+" se ponovilo "+count(rijec,niz[0])+" puta.");
		
		ulaz.close();
	}

}
