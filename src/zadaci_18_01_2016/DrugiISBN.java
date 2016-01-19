package zadaci_18_01_2016;

import java.util.Scanner;

public class DrugiISBN {

	public static void main(String[] args) {
		// ISBN-10 (International Standard Book Number) se sadrži od 10 brojeva:
		// d1 d2 d3 d4 d5 d6 d7 d8 d9 d10. Posljednji broj, d10, služi kao
		// checksum i njega izračunavamo iz prvih devet brojeva koristeći se
		// sljedećom formulom: (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6
		// * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11. Ukoliko je checksum 10, zadnji
		// broj označavamo sa X u skladu sa ISBN-10 konvencijom. Napisati
		// program koji pita korisnika da unese prvih 9 brojeva te ispiše
		// desetocifreni ISBN-10 broj. (Primjer: ukoliko unesemo, kao prvih 9
		// brojeva, 013601267 program nam ispisuje 0136012671 kao ISBN-10 broj.
		// Ukoliko unesemo 013031997 kao prvih 9 brojeva, program nam ispisuje
		// 013031997X kao ISBN-10 broj)
		Scanner input = new Scanner(System.in);
		// koristimo skener za unos brojeva sa konzole
		System.out.println("Unesite prvih devet brojeva:");
		// sve brojeve smijestamo u niz
		int[] niz = new int[9];
		for (int i = 0; i < 9; i++) {
			niz[i] = input.nextInt();
		}
		// koristimo privremenu varijablu temp
		int temp = 0;
		for (int i = 0; i < 9; i++) {
			temp = temp + niz[i] * i;
		}
		// da bi izracunali checksum
		int checksum = temp % 11;
		// ispisujemo sve clanove unijetog niza u jednom redu bez razmaka
		for (int b : niz) {
			System.out.print(b);
		}
		// i checksum ukoliko je jednak 10 onda ispisujemo na kraju istog reda X
		if (checksum == 10) {
			System.out.print("X");
		} else
			// a ako nije jednak 10 onda ispisujemo checksum koji dobijemo po
			// formuli koja je zadana u zadatku
			System.out.print(checksum);
		input.close();
	}
}
