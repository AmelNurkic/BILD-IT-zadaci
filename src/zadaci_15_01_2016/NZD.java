/*Napisati metodu koja prima dva cijela broja kao argumente te vraæa najveæi zajednièki djelilac za ta dva broja.

PRIMJER:

Unesite prvi broj: 125
Unesite drugi broj: 2525
Najveæi zajednièki djelilac za brojeve 125 i 2525 je 25.
*/
package zadaci_15_01_2016;

import java.util.Scanner;

public class NZD {

	public static void main(String[] args) {
		
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite dva broja: ");
		int a = ulaz.nextInt();//(int) (Math.random()*100); Nisam shvatio da li treba korisnik unijeti brojeve
		int b = ulaz.nextInt();//(int) (Math.random()*100); ili da izbaci slucajne brojeve pa sam ubacio i jedno i drugo
		System.out.println("Najveci zajednicki djelilac broja "+a+" i broja "+b+" je "+NZD(a,b));
		
		
		 ulaz.close();
	}
	public static int NZD(int a, int b)
	{
		  while(a!=0 && b!=0)
		  {
		     int c = b;
		     b = a%b;
		     a = c;
		  }
		  return a+b;

	}
	

}
