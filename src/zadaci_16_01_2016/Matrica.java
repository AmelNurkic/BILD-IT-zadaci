/*Napisati metodu koja ispisuje n x n matricu korsiteæi sljedeæi header:

public static void printMatrix(int n)

Svaki element u matrici je ili 0 ili 1, generisan nasumièno. 
Napisati test program koji pita korisnika da unese n te ispisuje n x n matricu.
*/
package zadaci_16_01_2016;

public class Matrica {
	
	public static void printMatrix(int n)
	{
	    int[][] matrica = new int[n][n];
	    for( int i = 0; i < n; i++ )
	        for( int j = 0; j < n; j++ )  //posto je matrica kvadratna duzina redova i kolona je ista t.j. n
	            matrica[i][j] = (int) (Math.random()+0.5); //Popunjavanje matrice
	    for( int i = 0; i < n; i++ )
	    {
	        for( int j = 0; j < n; j++ )
	            System.out.print(matrica[i][j]+" "); //Ispisivanje matrice
	        System.out.println();
	    }
	}

	public static void main(String[] args) {
		printMatrix(6);
	}

}
