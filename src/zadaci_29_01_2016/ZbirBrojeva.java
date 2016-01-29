package zadaci_29_01_2016;

import java.util.Scanner;

public class ZbirBrojeva {

	// metoda koja prima long broj
	public static int sumDigits(long n) {
		// inicijalizujemo sumu
		int sum = 0;
		// uslov dokle god je broj n veci od nule
		while (n > 0) {
			// suma je suma plus zadnja cifra broja koju dobijemo sa modulom 10
			sum = sum + (int) (n % 10);
			// pa broj postaje broj podijeljen sa 10 da nam vise ne racuna
			// zadnju cifru koju smo u prethodnom redu dodali na sumu
			n = n / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// Napisati metodu koja izračunava zbir svih brojeva u cijelom broju.
		// Koristite sljedeći header: public static int sumDigits(long n). Na
		// primjer, ako pozovemo metodu i proslijedimo joj broj 234
		// (sumDigits(234)) metoda treba da vrati 9. (2 + 3 + 4 = 9)

		// skener za unos broja
		Scanner input = new Scanner(System.in);
		// ispis
		System.out.println("Unesite neki broj");
		// smjestamo rboj
		long n = input.nextLong();
		// ispis i poziv metode
		System.out.println("Zbir svih cifara broja " + n + " je " + sumDigits(n));
		input.close();
	}
}
