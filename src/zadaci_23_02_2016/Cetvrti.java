package zadaci_23_02_2016;

import java.util.Scanner;

public class Cetvrti {

	// rekurzivna metoda koja sabira sve cifre broja
	public static int sumDigits(long n) {
		// ako je broj jednocifren
		if (n % 10 == n)
			// vrati taj broj ili ovo dodje kao i uslov da se prekine rekurzija
			return (int) n;
		else
			// vrati broj modul sa deset plus ponovo pozivanje metode samo broj
			// se dijeli sa deset
			return (int) n % 10 + sumDigits(n / 10);
	}

	public static void main(String[] args) {
		// (Sum the digits in an integer using recursion) Write a recursive
		// method that
		// computes the sum of the digits in an integer. Use the following
		// method header:
		// public static int sumDigits(long n)
		// For example, sumDigits(234) returns 2 + 3 + 4 = 9. Write a test
		// program
		// that prompts the user to enter an integer and displays its sum.

		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj cije cifre zelite da saberete:");
		long broj = input.nextLong();
		System.out.println("Suma cifara broja: " + broj + " je: " + sumDigits(broj));
		input.close();
	}
}
