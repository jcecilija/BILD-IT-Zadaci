package zadaci_15_02_2016;

import java.util.Scanner;

public class Peti {
	static void main(String[] args) {
		// (Process scores in a text file) Suppose that a text file contains an
		// unspecified
		// number of scores separated by blanks. Write a program that prompts
		// the user
		// to enter the file, reads the scores from the file, and displays their
		// total and
		// average.
		// skener za ucitati ime fajla u kojem se nalaze ocjene
		Scanner input = new Scanner(System.in);
		// ispis
		System.out.println("Unesite ime fajla:");
		// smjestamo ime fajla
		String imeFajla = input.next();
		// kreiramo objekat fajl
		java.io.File file = new java.io.File(imeFajla);
		if (!file.exists()) {// ukoliko fajl ne postoji ispisi
			System.out.println("Fajl ne postoji");
			System.exit(1);
		} // pokusaj
		try {
			// skener za citanje iz fajla
			Scanner ulaz = new Scanner(file);
			// inicijalizujemo sumu i brojac ocjena
			int suma = 0;
			int brojac = 0;
			// doklr skener moze da ucitava sljedeci int
			while (ulaz.hasNextInt()) {
				// suma je broj plus suma
				suma += ulaz.nextInt();
				// inkrementiramo brojac
				brojac++;
			} // zatvaramo skener
			ulaz.close();
			// racunamo prosjek
			double prosjek = suma / brojac;
			// ispis
			System.out.println("suma je : " + suma);
			System.out.println("Prosjek je: " + prosjek);
			// zatvaramo drugi skener
			input.close();
			// hvatanje greske
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
