package zadaci_12_02_2016;

import java.util.Scanner;

public class Cetvrti {

	public static void main(String[] args) {
		// (ArrayIndexOutOfBoundsException) Write a program that meets the
		// following requirements:
		// Creates an array with 100 randomly chosen integers.
		// Prompts the user to enter the index of the array, then displays the
		// corresponding element value. If the specified index
		// is out of bounds, display the message Out of Bounds.
		// kreiramo niz od 100 brojeva
		int[] niz = new int[100];
		// napunimo niz
		for (int i = 0; i < niz.length; i++) {
			niz[i] = (int) (Math.random() * 10);
		}
		// skener za ucitavanje korisnikovog unosa
		Scanner input = new Scanner(System.in);
		try {
			// probamo unijeti index niza
			System.out.println("Unesite index niza:");
			// smjestamo korisnikov unos
			int index = input.nextInt();
			// ispis
			System.out.println("Broj na: " + index + " je " + niz[index]);
		} // ukoliko je korisnik unio broj veci od velicine niza hvatamo gresku
			// i
		catch (ArrayIndexOutOfBoundsException ex) {
			// ispisujemo
			System.out.println("Unesite broj do 100");
		} // zatvaramo skener
		input.close();
	}

}
