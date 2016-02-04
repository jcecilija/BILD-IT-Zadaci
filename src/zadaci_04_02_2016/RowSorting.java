package zadaci_04_02_2016;

import java.util.Scanner;

public class RowSorting {

	// metoda koja nam sortira po velicini elemente reda
	public static double[][] sortRows(double[][] m) {
		// sa for petljom prolazimo kroz svaki red
		for (int i = 0; i < m.length; i++) {
			// da se ponovi koliko puta ima brojeva u tom redu
			for (int j = 0; j < m[0].length - 1; j++) {
				// prolazimo kroz kolone u redu
				for (int k = 0; k < m[0].length - 1; k++) {
					// uslov ako je neki index u tom redu veci od prethodnog
					if (m[i][k] > m[i][k + 1]) {
						// mijenjamo im mjesta sa privremenom temp
						double temp = m[i][k];
						m[i][k] = m[i][k + 1];
						m[i][k + 1] = temp;
					}
				}
			}
		} // metoda vraca sortiranu m matricu
		return m;
	}

	public static void main(String[] args) {
		// (Row sorting) Implement the following method to sort the rows in a
		// twodimensional array.
		// A new array is returned and the original array is intact.
		// public static double[][] sortRows(double[][] m)
		// Write a test program that prompts the user to enter a 3 * 3 matrix of
		// double
		// values and displays a new row-sorted matrix.

		// skener za unos
		Scanner input = new Scanner(System.in);
		// ispis korisniku da unese matricu
		System.out.println("Unesite double vrijednosti u 3*3 matricu: ");
		// kreiramo matricu 3*3
		double[][] matrica = new double[3][3];
		// sa duplom for petljom unosimo brojeve u matricu
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrica[i][j] = input.nextDouble();
			}
		}
		// ispis nase matrice sa duplom for petljom
		System.out.println("Vasa unesena matrica je: ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
		// zatvorimo skener
		input.close();
		// ispis
		System.out.println("Vasa sortirana matrica je: ");
		// kreiramo sortiranu matricu tako sto pozovemo metodu koja vraca
		// sortiranu matricu
		double[][] sortirana = sortRows(matrica);
		// sada sa duplom for petljom ispisemo sortiranu matricu
		for (int i = 0; i < sortirana.length; i++) {
			for (int j = 0; j < sortirana[0].length; j++) {
				System.out.print(sortirana[i][j] + " ");
			} // prelazak u novi red
			System.out.println();
		}
	}
}
