package zadaci_30_01_2016;

import java.util.Scanner;

public class Piramida {

	public static void main(String[] args) {
		// Napisati program koji pita korisnika da unese cijeli broj te ispisuje
		// piramidu svih brojeva do tog broja. (Na primjer, ukoliko korisnik
		// unese 7 vrh piramide je broj 1, red ispod vrha piramide je 2 1 2, red
		// ispod je 3 2 1 2 3, red ispod 4 3 2 1 2 3 4 itd.)

		// skener za ucitat broj
		Scanner input = new Scanner(System.in);
		// ispis
		System.out.println("Unesite cijeli broj za piramidu");
		// smjetamo unijeti broj
		int broj = input.nextInt();
		// ispis
		System.out.println("Vasa piramida je: ");
		// sa duplom for petljom ispisujem samo jednu stranu piramide
		for (int i = 1; i <= broj; i++) {
			// svaki put ispisujemo od 1 do broja i iz prethodnog fora
			for (int j = 1; j <= i; j++) {
				// ispis j u jednom redu
				System.out.print(j + " ");
			} // prelazak u novi red
			System.out.println();
		}
		input.close();
	}
}