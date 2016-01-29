package zadaci_29_01_2016;

public class ZbriRazlomaka {

	public static void main(String[] args) {
		// Napisati program koji sabira sljedeću seriju 1/3 + 3/5 + 5/7 + 7/9 +
		// 9/11 + 11/13 ..... + 95/97 + 97/99.

		// inicijalizujemo sumu kao double jer ce bit razlomci u pitanju i nece
		// bit cijeli brojevi
		double suma = 0;
		// jedna for petlja u koju stavljamo dvije promjenljive koje se
		// uvecavaju za 2
		for (int i = 1, j = 3; j < 100; i += 2, j += 2) {
			// svaki put sumi dodajemo rezultat i/j
			suma = suma + (double) i / j;
		} // ispis
		System.out.println(suma);
	}

}
