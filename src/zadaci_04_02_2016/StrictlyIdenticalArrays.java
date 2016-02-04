package zadaci_04_02_2016;

import java.util.Scanner;

public class StrictlyIdenticalArrays {

	// metoda koja provjerava jednakost
	public static boolean equals(int[][] m1, int[][] m2) {
		// postavimo boolean na false
		boolean jednaki = false;
		// sa duplom for petljom prolazimo kroz redove i kolone i poredimo svaki
		// clan m1 sa m2
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				// uslov ako su jednaki brojevi na istom broju reda i kolone m1
				// i m2
				if (m1[i][j] == m2[i][j]) {
					jednaki = true;
				} // ako nisu jednaki prekini petlju nema svrhe dalje trazit i
					// vrati jednaki u pocetku je postavljeno na false
				else {
					jednaki = false;
					break;
				}
			}
		} // metoda vraca boolean
		return jednaki;

	}

	public static void main(String[] args) {
		// The two-dimensional arrays m1 and m2 are strictly
		// identical if their corresponding elements are equal. Write a method
		// that returns
		// true if m1 and m2 are strictly identical, using the following header:
		// public static boolean equals(int[][] m1, int[][] m2)
		// Write a test program that prompts the user to enter two 3 * 3 arrays
		// of
		// integers and displays whether the two are strictly identical.

		// skener za unos matrica
		Scanner input = new Scanner(System.in);
		// ispis korisniku
		System.out.println("Unesite prvu matricu 3*3: ");
		// kreiranje prve matrice 3*3
		int[][] prva = new int[3][3];
		// popunjavanje matrice
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				prva[i][j] = input.nextInt();
			}
		}
		// ispis
		System.out.println("Unesite drugu matricu 3*3: ");
		// kreiranje druge matrice
		int[][] druga = new int[3][3];
		// popunjavanje druge matrice
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				druga[i][j] = input.nextInt();
			}
		}
		// pravimo novi boolean u koji smjestamo ono sto nam vraca metoda koja
		// provjerava jednakost
		boolean jednake = equals(prva, druga);
		// uslov za ispis
		if (jednake == true) {
			System.out.println("Matrice su jednake");
		} else if (jednake == false) {
			System.out.println("Matrice nisu jednake");
		}
		input.close();
	}
}
