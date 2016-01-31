package zadaci_30_01_2016;

import java.util.Scanner;

public class SSNumber {

	// metoda koja provjerava da li je ssn ispravan
	public static boolean ispravan(String unos) {
		// pretvaramo string unos u niz charova
		char[] korisnikovUnos = unos.toCharArray();
		// postavljamo boolean na false
		boolean tacan = false;
		// prvi uslov da ima 10 karaktera unos
		if (unos.length() == 10) {
			// boolean na tacno
			tacan = true;
			// sa for petljom prolazimo kroz svaki karakter unosa
			for (int k = 0; k < korisnikovUnos.length; k++) {
				// i poredimo da li je na odgovarajucim mjestima broj
				if ((korisnikovUnos[k] >= 48 && korisnikovUnos[k] <= 57)
						&& (k == 0 || k == 1 || k == 2 || k == 4 || k == 5 || k == 7 || k == 8 || k == 9 || k == 10)) {
					// ako jeste uslov tacan
					tacan = true;
				}
				// zatim provjeravamo da li je na 4 i 7 mjestu crtica a
				// pomocu ascii koda to sve radimo
				else if (korisnikovUnos[3] == 45 && korisnikovUnos[6] == 45) {
					// ako jeste boolean na tacno
					tacan = true;
				} else {
					// ako nije nista od gore navedenog tacno boolean na false
					tacan = false;
					// prekid
					break;
				}
			}
		} // metoda vraca boolean
		return tacan;
	}

	public static void main(String[] args) {
		// Napisati program koji pita korisnika da unese Social Security Number
		// (SSN) u formatu DDD-DD-DDDD gdje D predstavlja broj. Program treba da
		// provjerava da li je broj unesešen u ispravnom formatu. Ukoliko nije,
		// program pita korisnika da pokuša ponovo. Ukoliko jeste unešen u
		// pravom formatu, program završava sa radom.

		// skener za unos
		Scanner input = new Scanner(System.in);
		// ispis korisniku
		System.out.println("Unesite SSN u formatu DDD-DD-DDD");
		// smjestamo unos sa input.next() jer nam treba jedna rijec sa crticama,
		// ne koristimo nextLine jer ne ide i novi red
		String unos = input.next();
		// poziv metode koja provjerava da li je ispravan unos ako nije program
		// pita korisnika da pokusa ponovo
		while (ispravan(unos) != true) {
			System.out.println("Pokusajte ponovo");
			unos = input.next();
			ispravan(unos);
		}
		System.out.println("Unijeli ste ispravan snn");
		input.close();
	}
}