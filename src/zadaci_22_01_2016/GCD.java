/*Great circle distance predstavlja udaljenost izmeðu dvije taèke na površine sfere. 
 * Neka nam (x1, y1) i (x2, y2) predstavljaju geografsku širinu i dužinu dvije taèke. 
 * Great circle distance izmeðu ove dvije taèke može biti izraèunata koristeæi se sljedeæom formulom: 
 * 
 * d = radius * arccos (sin(x1) X sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2)) 
 * 
 * Napisati program koij pita korisnika da unese geografsku širinu i dužinu u stepenima dvije taèke na površini zemlje
 * te mu ispisuje great circle distance. Prosjeèni radius zemlje je 6.371.01 km. 
 * Stepene koje korisnik unese trebamo promijeniti u radianse koristeæi se Math.toRadians metodom 
 * jer Java trigonometrijske metode koriste radianse. Širina i dužina u ovoj formuli se odnose na zapad i sjever. 
 * Koristimo negativne vrijednosti da oznaèimo istok i jug. */
package zadaci_22_01_2016;

import java.util.*;

public class GCD {

	public static double GreatCircleDistance(double radius, double x1, double x2, double y1, double y2) {
		// d = radius * arccos (sin(x1) X sin(x2) + cos(x1) * cos(x2) * cos(y1 -y2))
		double d = radius
				* Math.acos((Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)));
		return d;
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		// Prosjecni radius zemlje 6.371.01 km.
		double radius = 6371.01;
		// unos koordinata prvog mjesta
		System.out.println("Unesite X1");
		double x1 = ulaz.nextDouble();
		System.out.println("Unesite X2");
		// unos koordinata drugog mjesta
		double x2 = ulaz.nextDouble();
		System.out.println("Unesite Y1");
		double y1 = ulaz.nextDouble();
		System.out.println("Unesite Y2");
		double y2 = ulaz.nextDouble();
		// stepene pretvaramo u radianse
		x1 = Math.toRadians(x1);
		x2 = Math.toRadians(x2);
		y1 = Math.toRadians(y1);
		y2 = Math.toRadians(y2);

		System.out.println(GreatCircleDistance(radius, x1, x2, y1, y2));
		ulaz.close();

	}

}
