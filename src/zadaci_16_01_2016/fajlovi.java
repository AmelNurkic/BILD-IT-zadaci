/*Napišite program koji æe brojati broj karaktera, rijeèi i linija teksta u nekom fileu. 
 * Rijeèi trebaju biti odvojene jednim spaceom. Ime file proslijediti kao argument u vaš program.
 */
package zadaci_16_01_2016;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class fajlovi {

	public static void main(String[] args) throws FileNotFoundException {

		int brojKaraktera = 0;
		int brojRijeci = 0;
		int brojLinija = 0;
		
		String fajl = "nekiFajl.txt";
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite putanju fajla: ");
		fajl = ulaz.next();
		Scanner ulaz2 = new Scanner(new FileReader(fajl));
		
		while (ulaz2.hasNextLine()) {
			  // citanje linije
			  String linija = ulaz2.nextLine();

			  // povecavanje brojaca linija
			  brojLinija++;

			  // citanje rijeci
			  String rijec [] = linija.split((" "));
			  for ( int i = 0; i <rijec.length ; i ++) {
			    if (rijec [i].length() > 0) {
			    	// povecavanje brojaca rijeci za 1
			      brojRijeci ++; 
			    }
			  }
			  //povecavanje brojaca karaktera
			  brojKaraktera += (linija.length());
			}
		System.out.println("U fajlu ima "+brojKaraktera+" karaktera "+brojRijeci+" rijeci i "+brojLinija+" linija");
	}

}
