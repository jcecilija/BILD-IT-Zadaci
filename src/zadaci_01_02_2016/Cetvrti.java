package zadaci_01_02_2016;

import java.util.Scanner;

public class Cetvrti {
	// metoda koja prima broj i koliko ce bit duzina broja sa nulama
	public static String format(int number, int width) {
		// primljeni broj pretvaramo u string
		String broj = number + "";
		// duzina stringa nam je width
		int duzina = width;
		// pravimo novi prazan string
		String novi = "";
		// i sa for petljom smjestamo nule u taj novi string onoliko nula koliko
		// je width minus broj mjesta koliko ima nas unijeti broj
		for (int i = duzina - broj.length(); i > 0; i--) {
			// dodajemo znaci nule
			novi = novi + 0;
		} // metoda nam vraca format tj broj sa nulama u duzini koliku smo
			// zadali sa width
		return novi + broj;
	}

	public static void main(String[] args) {
		// Napisati metodu sa sljedećim headerom: public static String
		// format(int number, int width) koja vraća string broja sa prefiksom od
		// jedne ili više nula. Veličina stringa je width argument. Na primjer,
		// ukoliko pozovemo metodu format(34, 4) metoda vraća 0034, ukoliko
		// pozovemo format(34, 5) metoda vraća 00034. Ukoliko je uneseni broj
		// veći nego width argument, metoda vraća samo string broja. Npr.
		// ukoliko pozovemo format(34, 1) metoda vraća 34.

		// skener
		Scanner input = new Scanner(System.in);
		// ispis korisniku
		System.out.println("Unesite broj:");
		// smjestamo broj
		int broj = input.nextInt();
		// ispis korisniku
		System.out.println("Unesite velicinu stringa:");
		// smjestamo duzinu naseg novog stringa koliki treba da bude
		int width = input.nextInt();
		// uslov ukoliko j eduzina manja od unesenog broja
		if (width > broj) {
			// ispisujemo broj bez nula
			System.out.println(broj);
		} // u suprotnom ono sto nam se i trazi u zadatku
		else
			// ispisujemo ono sto nam metoda vraca kada je pozovemo
			System.out.println(format(broj, width));
		// zatvramo skener
		input.close();
	}
}
