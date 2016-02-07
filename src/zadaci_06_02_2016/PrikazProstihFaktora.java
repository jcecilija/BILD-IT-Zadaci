package zadaci_06_02_2016;

import java.util.Scanner;

public class PrikazProstihFaktora {

	public static void main(String[] args) {
		// (Displaying the prime factors) Write a program that prompts the user
		// to enter
		// a positive integer and displays all its smallest factors in
		// decreasing order. For
		// example, if the integer is 120, the smallest factors are displayed as
		// 5, 3, 2, 2,
		// 2. Use the StackOfIntegers class to store the factors (e.g., 2, 2, 2,
		// 3, 5) and
		// retrieve and display them in reverse order.

		// skener za unos broja od korisnika
		Scanner input = new Scanner(System.in);
		// ispis
		System.out.println("Unesite pozitivan cio broj: ");
		int broj = input.nextInt();
		// uslov ako korisnik unese negativan broj
		if (broj < 0) {
			System.out.println("Unesite pozitivan broj:");
			broj = input.nextInt();
		}
		// kreiramo stek
		StackOfIntegers stek = new StackOfIntegers();
		// broj za koji racunamo faktore
		int temp = broj;
		// i je promjenljiva koja oznacava moguce faktore
		int i = 2;
		// dokle god je broj veci od 1
		while (temp != 1) {
			// provjeravamo ako postoji ostatak pri djeljenju, onda taj broj
			// nije faktor
			// broja za kojeg racunamo
			if (temp % i != 0) {
				i++;// povecavanje djelioca za 1
			} else {// ukoliko nema ostatka pri djeljenju, broj i je faktor
					// broja
				temp /= i;// dijelimo broj sa i da bi nastavili racunanje
							// sledeceg faktora
				stek.push(i);
				// dodajemo faktor na stek
			}
		}
		// ispis
		System.out.println("Prosti faktori broja : " + broj + " su :");
		// uslov dokle god na steku ima nesto
		while (!stek.empty())
			// ispisuj a sa syteka se ispisuje first in last out
			System.out.println(stek.pop());
		input.close();
	}
}
