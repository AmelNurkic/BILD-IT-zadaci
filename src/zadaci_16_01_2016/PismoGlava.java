/*Napisati metodu koja prima jedan argument te simulira bacanje nov�i�a toliko puta. 
Nakon �to se simulacija zavr�i, program ispisuje koliko puta je nov�i� pokazao glavu a koliko puta pismo.
 */
package zadaci_16_01_2016;

public class PismoGlava {
	
	public static void pismoGlava(int brojPonavljanja){
		int brojacPismo = 0; //brojac ukoliko se pojavi pismo
		int brojacGlava = 0; //brojac ukoliko se pojavi glava
		
		for (int i=0;i<brojPonavljanja;i++){ //for petljom ukazujemo koliko zelimo ponavljanja
			int broj = (int) (Math.random()*100); //uzimamo neki broj 0-100
			if(broj >50)
				brojacPismo++; //ovdje smo prepolovili broj sansi pismo/glava
			else{
				brojacGlava++;
			}
		}
		System.out.println("Pismo se pojavilo "+brojacPismo+" puta.");
		System.out.println("Glava se pojavila "+brojacGlava+" puta.");
	}

	public static void main(String[] args) {
		
		pismoGlava(100);
		
	}

}
