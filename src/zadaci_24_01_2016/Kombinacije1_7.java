/*Napisati program koji ispisuje sve mogu�e kombinacije za biranje dva broja u rasponu od 1 do 7. 
 * Tako�er, program ispisuje broj svih mogu�ih kombinacija.  
 * Dakle, program treba da ispi�e sve mogu�e parove brojeva u datom rasponu, krenuv�i sa 1 2, 1 3, 1 4, itd. 
 * Broj mogu�ih kombinacija je 21. */
package zadaci_24_01_2016;

public class Kombinacije1_7 {
	public static void ispisiKombinacije(){
		int [] niz = {1,2,3,4,5,6,7};
		for(int i=0;i<niz.length;i++){
			for(int j=0;j<niz.length;j++){
				if(i!=j){	//iako postoje kombinacije i 1-1 2-2 ... ja sam uzeo ovaj uslov, ne vidim drugaciji nacin
					System.out.print(niz[i]+"-"+niz[j]+" ");
				}
			}
		}
	}

	public static void main(String[] args) {
		
		ispisiKombinacije();

	

	}

}
