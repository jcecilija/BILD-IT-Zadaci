package zadaci_23_02_2016;

import java.util.Scanner;

public class Peti {
	// metoda
	public static int largest(int[] niz, int a) {
		// postavimo nulti clan niza kao najveci
		int max = niz[0];
		// uslov ako je neki broj na indexu niza veci od max
		if (niz[a] > max) {
			// max postaje taj clan niza
			max = niz[a];
			// metoda vraca taj max
			return max;
		} else
			// ponovno poziv metode samo sada niz i index za 1 manje od duzine
			// niza
			return largest(niz, a - 1);
	}

	public static void main(String[] args) {
		// (Find the largest number in an array) Write a recursive method that
		// returns the
		// largest integer in an array. Write a test program that prompts the
		// user to enter a
		// list of eight integers and displays the largest element.

		// skener
		Scanner input = new Scanner(System.in);
		// ispis
		System.out.println("Unesite osam brojeva u niz:");
		// kreiramo niz
		int[] niz = new int[8];
		// popunimo niz
		for (int i = 0; i < niz.length; i++) {
			niz[i] = input.nextInt();
		}
		// ispis i poziv metode
		System.out.println("Najveci elemenat u nizu je: " + largest(niz, niz.length - 1));
		// zatvorimo skener
		input.close();
	}
}
