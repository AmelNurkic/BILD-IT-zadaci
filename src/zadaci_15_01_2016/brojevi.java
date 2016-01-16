/*Napišite program koji generiše 100 nasumiènih cijelih brojeva izmeðu 0 i 9 te ispisuje koliko se puta koji broj ponovio.*/
package zadaci_15_01_2016;

public class brojevi {

	public static void main(String[] args) {
		int brojac0=0; //brojaci 0-9
		int brojac1=0;
		int brojac2=0;
		int brojac3=0;
		int brojac4=0;
		int brojac5=0;
		int brojac6=0;
		int brojac7=0;
		int brojac8=0;
		int brojac9=0;
		int [] niz = new int[100]; //inicijalizacija niza
		for(int i = 0;i<100;i++){
			niz[i]=(int) (Math.random()*10); //prolazenje kroz niz i dodjeljivanje slucajnih brojeva 0-9
			System.out.print(niz[i]+" "); //prikazivanje niza
			if(niz[i]==0) //ako je nula
				brojac0++; // povecati brojac0 za 1
			else if(niz[i]==1)
				brojac1++;
			else if(niz[i]==2)
				brojac2++;
			else if(niz[i]==3)
				brojac3++;
			else if(niz[i]==4)
				brojac4++;
			else if(niz[i]==5)
				brojac5++;
			else if(niz[i]==6)
				brojac6++;
			else if(niz[i]==7)
				brojac7++;
			else if(niz[i]==8)
				brojac8++;
			else if(niz[i]==9)
				brojac9++;
		}
		
		System.out.println("Broj 0 se ponovio "+brojac0+" puta");
		System.out.println("Broj 1 se ponovio "+brojac1+" puta");
		System.out.println("Broj 2 se ponovio "+brojac2+" puta");
		System.out.println("Broj 3 se ponovio "+brojac3+" puta");
		System.out.println("Broj 4 se ponovio "+brojac4+" puta");
		System.out.println("Broj 5 se ponovio "+brojac5+" puta");
		System.out.println("Broj 6 se ponovio "+brojac6+" puta");
		System.out.println("Broj 7 se ponovio "+brojac7+" puta");
		System.out.println("Broj 8 se ponovio "+brojac8+" puta");
		System.out.println("Broj 9 se ponovio "+brojac9+" puta");

	}

}
