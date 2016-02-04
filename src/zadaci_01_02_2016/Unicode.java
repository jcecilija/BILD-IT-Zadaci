package zadaci_01_02_2016;

import java.util.Scanner;

public class Unicode {

	public static void main(String[] args) {
		// Napisati program koji prima karakter te vraća njegov Unicode.
		// Primjer: ukoliko korisnik unese karakter E program mu vraća 69 kao
		// unicode za taj karakter.

		// skener za unos
		Scanner input = new Scanner(System.in);
		// ispis korisniku
		System.out.println("Unesite neki karakter sa tastature:");
		// unosimo kao string unos
		String unos = input.nextLine();
		// posto karakter nam treba onda uzimamo karakter iz stringa prethodnog
		// na poziciji 0
		char karakter = unos.charAt(0);
		// pretvaramo karakter u broj
		int unicode = (int) karakter;
		// ispis korisniku
		System.out.println("Unijeli ste karakter " + karakter + " a njegov unicode je: " + unicode);
		// zatvaramo skener
		input.close();
	}
}