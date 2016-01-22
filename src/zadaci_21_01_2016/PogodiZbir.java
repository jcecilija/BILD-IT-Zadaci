package zadaci_21_01_2016;

import java.util.Scanner;

public class PogodiZbir {

	public static void main(String[] args) {
		// Napisati program koji ispisuje tri nasumična cijela broja te pita
		// korisnika da unese njihov zbir. Ukoliko korisnik pogriješi, program
		// ispisuje pitanje ponovo sve sa porukom da pokuša ponovo. Ukoliko
		// korisnik unese tačan odgovor, program mu čestita i završava sa radom.

		Scanner input = new Scanner(System.in);// skener za ucitavanje
												// korisnikovog zbira
		// nasumicno tri cijela broja dobivamo i smjestamo u prvi,drugi.treci
		int prvi = (int) (Math.random() * 10);
		int drugi = (int) (Math.random() * 20);
		int treci = (int) (Math.random() * 30);
		int zbir = prvi + drugi + treci;// tacan zbir brojeva
		// ispis
		System.out.println("Unesite zbir brojeva:" + prvi + " + " + drugi + " + " + treci);
		// smjestamo korisnikov unoz zbira u varijablu
		int korisnikovUnos = input.nextInt();
		// uslov da se petlja ponavlja dokle god korisnik ne pogodi tacan zbir
		while (zbir != korisnikovUnos) {
			System.out.println("Pogrijesili ste pokusajte ponovo!");// ispis ako
																	// korisnik
																	// nije
																	// pogodio
			korisnikovUnos = input.nextInt();// ponovo korisnik unosi zbir koji
												// smjestamo u korisnikovUnos
		}
		System.out.println("Cestitaimo");// ispis
		input.close();// zatvaramo skener kad korisnik pogodi zbir
	}
}
