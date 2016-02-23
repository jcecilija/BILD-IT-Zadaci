package zadaci_22_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Drugi {

	// metoda
	public static int gcd(int m, int n) {
		// ako je m%n jednako nula vrati n
		if (m % n == 0) {
			return n;
		} else
			// u suprotnom poziva se metoda ponovo ali sada je m postaje n a n
			// postaje m%n
			return gcd(n, m % n);
	}

	public static void main(String[] args) {
		// (Compute greatest common divisor using recursion) The gcd(m, n) can
		// also
		// be defined recursively as follows:
		// ■ If m % n is 0, gcd(m, n) is n.
		// ■ Otherwise, gcd(m, n) is gcd(n, m % n).
		// Write a recursive method to find the GCD. Write a test program that
		// prompts the
		// user to enter two integers and displays their GCD.

		// skener
		Scanner input = new Scanner(System.in);
		// tray i catch blok
		try {
			System.out.println("Unesite dva cijela broja:");
			int m = input.nextInt();
			int n = input.nextInt();
			// ispis i poziv rekurzivne metode u mainu
			System.out.println("Najveci zajednicki djelilac za brojeve: " + m + " i " + n + " je: " + gcd(m, n));
		} catch (InputMismatchException e) {
			System.out.println(e);
		}
		input.close();
	}

}
