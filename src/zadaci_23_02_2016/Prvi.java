package zadaci_23_02_2016;

import java.util.Scanner;

public class Prvi {
	// rekurzivna metoda
	public static void reverseDisplay(int broj) {
		// uslov za prekid rekurzije
		if (broj < 10)
			System.out.print(broj);
		else {
			// stampa
			System.out.print(broj % 10);
			// ponovni poziv metode
			reverseDisplay(broj / 10);
		}
	}

	public static void main(String[] args) {
		// (Print the digits in an integer reversely) Write a recursive method
		// that displays
		// an int value reversely on the console using the following header:
		// public static void reverseDisplay(int value)
		// For example, reverseDisplay(12345) displays 54321. Write a test
		// program
		// that prompts the user to enter an integer and displays its reversal.

		// skener
		Scanner input = new Scanner(System.in);
		// ispis
		System.out.println("Unesite neki cio broj");
		// smjestanje broja
		int broj = input.nextInt();
		// poziv rekurzivne metode
		reverseDisplay(broj);
		input.close();
	}

}
