package zadaci_25_01_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class Brojevi {

	public static void main(String[] args) {
		// Napisati program koji učitava neodređen broj cijelih brojeva,
		// određuje koliko je pozitivnih brojeva korisnik unijeo, koliko
		// negativnih te izračunava ukupnu sumu i prosjek svih unesenih brojeva.
		// (Korisnik prekida unos tako što unese nulu). Na primjer, ukoliko
		// korisnik unese 1 2 -1 3 0 program treba da ispiše da je broj
		// pozitivnih brojeva 3, negativnih brojeva 1, suma ili zbir su 5.0 a
		// prosjek svih brojeva je 1.25.

		// skener pravimo
		Scanner input = new Scanner(System.in);
		// pravimo arraylistu u koju smjestamo unos jer ne znamo koliko cemo
		// brojeva unijet
		ArrayList<Integer> brojevi = new ArrayList<Integer>();
		// ispis
		System.out.println("Unesite proizvoljan broj cijelih brojeva, nula prekida unos");
		// unos cijelog broja
		int broj = input.nextInt();
		// sumu stavljamo kao double i dodijeljujemo joj prvi broj
		double suma = broj;
		// brojeve smjestamo u niz
		brojevi.add(broj);
		// dokle je unos razlicit od nula
		while (broj != 0) {
			// unosimo broj i smjestamo u niz
			broj = input.nextInt();
			brojevi.add(broj);
			// a sumi dodajemo svaki sljedeci broj
			suma = suma + broj;
		}
		// pozitivni i negativni inicijalizovani
		int pozitivni = 0;
		int negativni = 0;
		// sa for petljom prolazimo kroz niz da pobrojimo pozitivne i negativne
		// brojeve
		for (int i = 0; i < brojevi.size() - 1; i++) {
			// uslov za negativan broj
			if (brojevi.get(i) < 0) {
				// ako je uslov ispunjen inkrementiramo negativan broj
				negativni++;
				// u suprotnom pozitivan inkrementiramo
			} else
				pozitivni++;
		}
		// racunanje prosjeka
		double prosjek = (double) suma / (pozitivni + negativni);
		// ispis
		System.out.println("Broj pozitivnih brojeva je: " + pozitivni);
		System.out.println("Broj negativnih brojeva je: " + negativni);
		System.out.println("Suma brojeva je: " + suma);
		System.out.println("A prosjek svih brojeva je: " + prosjek);
		input.close();
	}

}
