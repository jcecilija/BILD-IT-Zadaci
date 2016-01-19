package zadaci_16_01_2016;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class BrojacTeksta {

	public static void main(String[] args) throws IOException {
		// Napišite program koji će brojati broj karaktera, riječi i linija
		// teksta u nekom fileu. Riječi trebaju biti odvojene jednim spaceom.
		// Ime file proslijediti kao argument u vaš program.

		java.io.File file = new java.io.File("tekstTest.txt");
		if (!file.exists()) {// ukoliko fajl ne postoji ispisi
			System.out.println("Fajl ne postoji");
			System.exit(1);
		} // scanner za citanje teksta iz fajla
		Scanner input = new Scanner(file);
		// postavljanje pocetnih vrijednosti za trazene vrijednosti
		int ukupanBrojKaraktera = 0;
		int brojKaraktera = 0;
		int brojRijeci = 0;
		int brojLinija = 0;
		// cita se tekst iz fajla dokle god ima jos
		while (input.hasNext()) {
			String tekst = input.next();
			// broj karaktera jedne rijeci je jednak duzini te rijeci
			brojKaraktera = tekst.length();
			// ukoliko je broj karaktera veci od nule to je rijec
			if (brojKaraktera > 0) {
				// i onda ukupan broj karaktera u tekstu je jednak svakom
				// sabranom karakteru
				ukupanBrojKaraktera = brojKaraktera + ukupanBrojKaraktera;
				// a ukupan broj rijeci inkrementiramo
				brojRijeci++;
			}
		}
		//
		LineNumberReader lines = new LineNumberReader(new FileReader(file));
		String linije;
		try {
			while ((linije = lines.readLine()) != null)
				;// dokle god je string linije razlicit od null
			brojLinija = lines.getLineNumber();// broj linija je
												// lines.getBrojLinija
		} catch (Exception ex) { // catch blok
			System.out.println("Greska");
		} // ispis
		System.out.println("Broj stringova je " + brojRijeci);
		System.out.println("Broj karaktera u fajlu je " + ukupanBrojKaraktera);
		System.out.println("Broj linija u tekstu je " + brojLinija);
		// zatvaranje
		input.close();
		lines.close();

	}
}
