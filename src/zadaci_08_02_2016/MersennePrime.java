package zadaci_08_02_2016;

import java.math.BigInteger;

public class MersennePrime {
	// metoda za pronalazak prostog p
	public static boolean isPrime(int p) {
		// postavljamo boolean na true
		boolean prost = true;
		// for petlja kojom prolazimo kroz sve brojeve manje do 100
		// for (int i = 2; i <= 100; i++) {
		// sa drugom for petljom pronalazimo prost broj
		for (int j = 2; j <= p / 2; j++) {
			// ako je broj djeljiv sa nekim brojem onda nije prost
			if (p % j == 0) {
				// i prost postaje false
				prost = false;
				// prekida se petlja
				break;
			} // u suprotnom je broj prost
			else
				prost = true;
		}
		return prost;
	}

	public static void main(String[] args) {
		// (Mersenne prime) A prime number is called a Mersenne prime if it can
		// be written in the form 2p - 1 for some
		// positive integer p. Write a program that finds
		// all Mersenne primes with p … 100 and displays the output as shown
		// below.
		// (Hint: You have to use BigInteger to store the number, because it is
		// too big to
		// be stored in long

		// kreiramo objekat osnova
		BigInteger osnova = new BigInteger("2");
		// sa for petljom prolazimo kroz brojeve do 100
		for (int i = 2; i <= 100; i++) {
			// uslov i poziv metode
			if (isPrime(i)) {
				// ako je uslov ispunjen ispis
				System.out.print(i + "      ");
				// kreiramo novi objekat u koji smjestamo trazeni broj
				BigInteger mersenne = (osnova.pow(i).subtract(new BigInteger("1")));
				System.out.println(mersenne);
			}
		}
	}
}
