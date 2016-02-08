package zadaci_08_02_2016;

import java.math.BigInteger;

public class Prvi {

	public static void main(String[] args) {
		// (Divisible by 2 or 3) Find the first ten numbers with 50 decimal
		// digits that are
		// divisible by 2 or 3.

		// koristimo BigInteger klasu i pravimo objekat pocetni u koji upisujemo
		// kao string, jer to i jeste broj 1 i 49 nula jer nam se u zadatku
		// trazi broj sa 50 mjesta
		BigInteger pocetni = new BigInteger("10000000000000000000000000000000000000000000000000");
		// inicijalizujemo brojac
		int brojac = 0;
		// uslov dok je brojac manji od 10 jer nam treba prvih 10 brojeva
		while (brojac < 10) {
			// uslov sa je broj djeljiv sa 2 ili sa 3
			if (pocetni.mod(new BigInteger("2")).equals(new BigInteger("0"))
					|| pocetni.mod(new BigInteger("3")).equals(new BigInteger("0"))) {
				// inkrementiramo brojac
				brojac++;
				// ispis objekta koji ispunjava uslov
				System.out.println(pocetni);
			}
			// sada pocetni objekat uvecavamo za jedan jer trazimo dalje
			pocetni = pocetni.add(new BigInteger("1"));
		}
	}
}
