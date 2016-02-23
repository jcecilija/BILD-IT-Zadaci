package zadaci_23_02_2016;

import java.util.Scanner;

public class Drugi {
	// rekurzivna metoda
	public static void reverseDisplay(String value) {
		// uslov za prekid rekurzije
		if (value.length() == 1)
			System.out.println(value);
		else
			// ispis
			System.out.println(value.charAt(value.length() - 1));
		// poziv metode sama sebe
		reverseDisplay(value.substring(0, value.length() - 1));
	}

	public static void main(String[] args) {
		// (Print the characters in a string reversely) Write a recursive method
		// that displays a string reversely
		// on the console using the following header:
		// public static void reverseDisplay(String value)
		// For example, reverseDisplay("abcd") displays dcba. Write a test
		// program
		// that prompts the user to enter a string and displays its reversal.

		// skener
		Scanner input = new Scanner(System.in);
		// ispis
		System.out.println("Unesite neki string:");
		// unos teksta
		String tekst = input.nextLine();
		// zatvoren skener
		input.close();
		// hvatanje greske jer mi se javlja out of bounds
		try {
			reverseDisplay(tekst);
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
}