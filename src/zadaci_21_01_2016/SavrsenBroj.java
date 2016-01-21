/*Pozitivni cijeli broj je savr�en broj ukoliko je jednak zbiru svih svojih pozitivnih djelilaca, isklju�uju�i sebe.
Na primjer, 6 je prvi savr�eni broj jer 6 = 3 + 2 + 1. Sljede�i savr�eni broj je 28 jer 28 = 14 + 7 + 4 + 2 + 1. 
Samo 4 savr�ena broja postoje u rasponu od 0 do 10.000. Napi�ite program koji ispisuje sva 4.
*/
package zadaci_21_01_2016;

public class SavrsenBroj {

	public static boolean savrsenBroj(int broj) {

		int priv = 0;
		for (int i = 1; i <= broj / 2; i++) {
			if (broj % i == 0) {
				priv += i;
			}
		}
		if (priv == broj) 
			return true;
			return false;
	}

	public static void main(String[] args) {
		for (int i = 1; i < 10000; i++) {
			if (savrsenBroj(i)) {
				System.out.print(i+" ");
			}
		}
	}
}
