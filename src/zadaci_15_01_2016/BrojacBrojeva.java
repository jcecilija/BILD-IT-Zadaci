package zadaci_15_01_2016;

public class BrojacBrojeva {

	public static void main(String[] args) {
		// Napišite program koji generiše 100 nasumičnih cijelih brojeva između
		// 0 i 9 te ispisuje koliko se puta koji broj ponovio.
		// napravimo niz od deset brojeva tj od 0 do 9
		int[] niz = new int[10];
		// sa for petljom ucitamo u taj niz nasumicnih 100 brojeva 0 do 9
		for (int i = 0; i <= 100; i++) {
			int broj = (int) (Math.random() * 10);
			// i svaki puta kad se ucita broj od 0 do 9 mi povecamo broj na tom
			// indexu u nizu
			niz[broj]++;
		}
		// sa sljedecom for petljom prodjemo kroz niz i ispisemo koliko puta se
		// koji br ponovio
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Broj " + i + " se ponovio: " + niz[i] + " puta");
		}
	}

}
