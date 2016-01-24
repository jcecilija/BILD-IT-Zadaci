package zadaci_24_01_2016;

import java.util.Scanner;

public class BrojDanaUGodini {
	// metoda
	public static int numberOfDayInYear(int year) {
		// uslov da li je godina prestupna
		if ((year % 100 != 0 && year % 4 == 0) || year % 400 == 0) {
			// ukoliko jeste vraca broj dana 366
			return 366;
		} else
			// ako nije prestupna vraca 365
			return 365;
	}

	public static void main(String[] args) {
		// Napisati metodu koja vraća broj dana u godini. Metoda koristi
		// sljedeći header: public static int numberOfDayInAYear(int year).
		// Napisati program koji pita korisnika da unese početnu godinu, krajnju
		// godinu te ispisuje broj dana za svaku godinu u rasponu.

		// skener za unos
		Scanner input = new Scanner(System.in);
		// ispis
		System.out.println("Unesite pocetnu godinu:");
		// pocetna godina
		int pocetna = input.nextInt();
		System.out.println("Unesite krajnju godinu: ");
		// krajnja godina
		int krajnja = input.nextInt();
		// petlja sa kojom prolazimo kroz godine od pocetne do krajnje
		for (int i = pocetna; i <= krajnja; i++) {
			// ispisujemo broj dana za svaku godinu tako sto pozivamo i metodu
			// na svakoj godini
			System.out.println("Broja dana za " + i + " je: " + numberOfDayInYear(i));
		}
		// zatvaramo skener
		input.close();
	}

}
