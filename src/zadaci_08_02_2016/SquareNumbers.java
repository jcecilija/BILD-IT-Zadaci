package zadaci_08_02_2016;

import java.math.BigInteger;

public class SquareNumbers {

	public static void main(String[] args) {
		// (Square numbers) Find the first ten square numbers that are greater
		// than
		// Long.MAX_VALUE. A square number is a number in the form of n2. For
		// example, 4, 9, and 16 are square numbers. Find an efficient approach
		// to run your program fast.

		// inicijalizujemo max long
		String maxLong = Long.MAX_VALUE + "";
		// inicijalizujemo objekat pocetni big integer klase tako sto na max
		// long dodamo 1
		BigInteger pocetni = new BigInteger(maxLong).add(new BigInteger("1"));
		// inicijalizujemo brojac na nula
		int brojac = 0;
		// dokle je brojac razlicit od 10
		while (brojac != 10) {
			// square big integer je pocetni na kvadrat
			BigInteger square = pocetni.pow(2);
			// ispis
			System.out.println(square);
			// inkrementiramo brojac
			brojac++;
			// a pocetni uvecavamo za jedan isto
			pocetni = pocetni.add(new BigInteger("1"));
		}
	}
}
