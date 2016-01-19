package zadaci_15_01_2016;

import java.util.Scanner;

public class BrojSamoglasnikaISuglasnika {

	public static void main(String[] args) {
		// Pretpostavimo da su slova A, E, I, O i U samoglasnici. (Smjela
		// pretpostavka, znam) Napisati program koji pita korisnika da unese
		// string te mu ispište broj samoglasnika i suglasnika u datom stringu.
		// scanner za unos teksta
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite neki tekst");
		// string je unos
		String unos = input.nextLine();
		// pretvaramo sva slova u velika
		unos = unos.toUpperCase();
		// sada string pretvaramo u niz karaktera da mozemo porediti
		// samoglasnike
		char[] tekst = unos.toCharArray();
		int brojSamoglasnika = 0;
		int brojSuglasnika = 0;
		// sa for ic petljom prolazimo kroz cio niz karaktera i uporedjujemo da
		// li je svaki karakter jednak samoglasnicima
		for (char i : tekst) {
			if (i == 'A' || i == 'E' || i == 'I' || i == 'O' || i == 'U') {
				// ukoliko jeste povecavamo brojac samoglasnika
				brojSamoglasnika++;
			} else
				// ukoliko uslov nije ispunjen povecavamo brojac suglasnika
				brojSuglasnika++;
		}
		System.out.println("Broj samoglasnika u datom stringu je " + brojSamoglasnika);
		System.out.println("A broj suglasnika je " + brojSuglasnika);
		// zatvaramo skener
		input.close();

	}

}
