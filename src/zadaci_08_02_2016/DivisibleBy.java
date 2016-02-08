package zadaci_08_02_2016;

import java.math.BigInteger;

public class DivisibleBy {

	public static void main(String[] args) {
		// (Divisible by 5 or 6) Find the first ten numbers greater than
		// Long.MAX_VALUE
		// that are divisible by 5 or 6.

		// inicijalizujemo max long
		String maxLong = Long.MAX_VALUE + "";
		// kreiramo objekat klase big integer kao pocetni broj
		BigInteger pocetni = new BigInteger(maxLong).add(new BigInteger("1"));
		// inicijalizujemo brojac
		int brojac = 0;
		// uslov
		while (brojac != 10) {
			// uslov ako je nas objekat nad kojim radimo ispitivanje djeljiv sa
			// 5 ili 6
			if (pocetni.mod(new BigInteger("5")).equals(new BigInteger("0"))
					|| pocetni.mod(new BigInteger("6")).equals(new BigInteger("0"))) {
				// inkrementiramo brojac
				brojac++;
				// ispisujemo objekat broj
				System.out.println(pocetni);
			}
			// a inkrementiramo i objekat broj
			pocetni = pocetni.add(new BigInteger("1"));
		}
	}
}