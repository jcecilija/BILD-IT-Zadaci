package zadaci_04_02_2016;

import java.util.Scanner;

public class Location {
	// Design a class named Location for locating a maximal
	// value and its location in a two-dimensional array. The class contains
	// public data
	// fields row, column, and maxValue that store the maximal value and its
	// indices
	// in a two-dimensional array with row and column as int types and maxValue
	// as a double type.
	// Write the following method that returns the location of the largest
	// element in a
	// two-dimensional array:
	// public static Location locateLargest(double[][] a)

	// klasa sadrzi
	public int row;
	public int column;
	public double maxValue;

	// metoda koja vraca lokaciju najveceg elementra objekta
	public static Location locateLargest(double[][] a) {
		// kreiramo novi objekat lokacija x
		Location x = new Location();
		// zadamo mu pocetne vrijednosti sve nule
		x.column = 0;
		x.row = 0;
		x.maxValue = a[0][0];
		// sa for petljom prolazimo kroz svaki elemenat objekta a i poredimo da
		// dobijemo lokaciju najveceg
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				// uslov ako je lokacija proslijeditog objekta a veca od naseg
				// postavitog x
				if (a[i][j] > x.maxValue) {
					// onda mijenjaju vrijednosti
					x.maxValue = a[i][j];
					// i dobijamo lokaciju i smjestamo u nas x objekat
					x.row = i;
					x.column = j;
				}

			}
		} // ispis
		System.out.println("Lokacija najveceg elementa " + x.maxValue + " je: " + " (" + x.row + " " + x.column + " )");
		// metoda vraca lokaciju tj x objekat koji je lokacija
		return x;
	}

	// main za provjeru
	public static void main(String[] args) {
		// skener za unos
		Scanner input = new Scanner(System.in);
		// ispis korisniku
		System.out.println("Unesite broj redova i kolona vase matrice:");
		// smjestamo korisnikov unosi inicijalizujemo red i kolone
		int row = input.nextInt();
		int column = input.nextInt();
		// ispis
		System.out.println("Unesite vrijednosti u vasu matricu :" + row + " x " + column);
		// kreiramo nasu matricu
		double[][] matrica = new double[row][column];
		// sa duplom for petljom prolazimo kroz redove i kolone i punimo je
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				// smjestamo korisnikov unos
				matrica[i][j] = input.nextDouble();
			}
		}
		// ispis nase unijete matrice
		System.out.println("Vasa matrica je:");
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				System.out.print(matrica[i][j] + " ");
			} // novi red
			System.out.println();
		} // poziv metode
		Location.locateLargest(matrica);
		input.close();
	}
}
