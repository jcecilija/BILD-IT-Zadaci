package zadaci_08_02_2016;

import java.math.*;

public class LargePrimeNumbers {

	public static void main(String[] args) {
		// Write a program that finds five prime numbers larger
		// than Long.MAX_VALUE.

		// inicijalizujemo long max value
		String maxLong = Long.MAX_VALUE + "";
		// ispis
		System.out.println("Max value long broj je: " + maxLong);
		System.out.println("Prvih pet prime brojeva koji su veci od njega su: ");
		// kreiramo objekat pocetni a pomocu BigInteger klase i dodamo mu 1 jer
		// treba da bude veci od long max value
		BigInteger pocetni = new BigInteger(maxLong).add(new BigInteger("1"));
		// inicijalizujemo brojac
		int brojac = 5;
		// uslov
		while (brojac > 0) {
			// uslov u kojem ispitujemo da li je prost sa metodom koja nam se
			// nalazi u big integer klasi
			if (pocetni.isProbablePrime(7)) {
				// ispis
				System.out.println(pocetni);
				// smanjujemo brojac za jedan
				brojac--;
			}
			// objektu big integer klase dodajemo 1 tj uvecavamo ga da trazimo
			// dalje
			pocetni = pocetni.add(new BigInteger("1"));
		}
	}
}