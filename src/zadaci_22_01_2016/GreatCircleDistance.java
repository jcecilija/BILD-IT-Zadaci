package zadaci_22_01_2016;

import java.util.Scanner;

public class GreatCircleDistance {

	public static void main(String[] args) {
		// Great circle distance predstavlja udaljenost između dvije tačke na
		// površine sfere. Neka nam (x1, y1) i (x2, y2) predstavljaju geografsku
		// širinu i dužinu dvije tačke. Great circle distance između ove dvije
		// tačke može biti izračunata koristeći se sljedećom formulom: d =
		// radius * arccos (sin(x1) X sin(x2) + cos(x1) * cos(x2) * cos(y1 -
		// y2)). Napisati program koij pita korisnika da unese geografsku širinu
		// i dužinu u stepenima dvije tačke na površini zemlje te mu ispisuje
		// great circle distance. Prosječni radius zemlje je 6.371.01 km.
		// Stepene koje korisnik unese trebamo promijeniti u radianse koristeći
		// se Math.toRadians metodom jer Java trigonometrijske metode koriste
		// radianse. Širina i dužina u ovoj formuli se odnose na zapad i sjever.
		// Koristimo negativne vrijednosti da označimo istok i jug.
		// skener za unos
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite geografsku sirinu i duzinu prve tacke u stepenima:");
		double sirina1 = input.nextDouble();
		double duzina1 = input.nextDouble();
		System.out.println("Unesite geografsku sirinu i duzinu za drugu tacku:");
		double sirina2 = input.nextDouble();
		double duzina2 = input.nextDouble();
		// zadano u zadatku
		double radiusZemlje = 6371.01;
		double x1 = Math.toRadians(sirina1);
		double y1 = Math.toRadians(duzina1);
		double x2 = Math.toRadians(sirina2);
		double y2 = Math.toRadians(duzina2);
		// formula data u opisu zadatka
		double d = radiusZemlje
				* Math.acos((Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)));
		// ispis
		System.out.println("Great circle distance is: " + d);
		input.close();
	}
}
