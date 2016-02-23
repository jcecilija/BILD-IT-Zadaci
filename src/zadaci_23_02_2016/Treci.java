package zadaci_23_02_2016;

import java.util.Scanner;

public class Treci {

	// rekurzivna metoda koja vraca brojacanu vrijednost koliko puta se karakter
	// ponovio u stringu
	public static int count(String str, char a) {
		// uslov ako je duzina stringa nula onda je nula
		if (str.length() == 0)
			return 0;
		else {
			// ako je karakter na zadnjem indeksu stringa jednak karakteru koji
			// se poredi
			if (str.charAt(str.length() - 1) == a) {
				// vrati broj 1 plus ponovo poziv metode
				return 1 + count(str.substring(0, str.length() - 1), a);
			} else
				// uslov ako je samo jednom ponovljeno slovo u stringu
				return 0 + count(str.substring(0, str.length() - 1), a);
		}
	}

	public static void main(String[] args) {
		// (Occurrences of a specified character in a string) Write a recursive
		// method that
		// finds the number of occurrences of a specified letter in a string
		// using the following method header:
		// public static int count(String str, char a)
		// For example, count("Welcome", 'e') returns 2. Write a test program
		// that
		// prompts the user to enter a string and a character, and displays the
		// number of
		// occurrences for the character in the string.

		// skener
		Scanner input = new Scanner(System.in);
		// ispis
		System.out.println("Unesite neki string:");
		// unos teksta
		String tekst = input.nextLine();
		// ispis
		System.out.println("Unesite kojo slovo brojite:");
		// unos slova
		char slovo = input.next().charAt(0);
		// zatvoren skener
		input.close();
		System.out
				.println("Karakter " + slovo + " u tekstu " + tekst + " se ponovio " + count(tekst, slovo) + " puta ");
	}
}
