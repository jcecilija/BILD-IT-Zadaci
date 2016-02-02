package zadaci_02_02_2016;

import java.util.Scanner;

public class SabiranjeDvijeMatrice {

	// metoda koja sabira matrice i vraca zbir
	public static double[][] addMatrix(double[][] a, double[][] b) {
		// pravimo matricu zbir i koju cemo smjestat sabrane prve dvije, a da bi
		// se matrice mogle sabirati moraju biti iste row i column
		double[][] zbir = new double[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				// sabiranje
				zbir[i][j] = a[i][j] + b[i][j];
			}
		}
		// vraca metoda zbir
		return zbir;
	}

	public static void main(String[] args) {
		// (Algebra: add two matrices) Write a method to add two matrices. The
		// header of
		// the method is as follows:

		// skener za ucitavanje
		Scanner input = new Scanner(System.in);
		// ispis
		System.out.println("Unesite koliku matricu zelite: ");
		// smjestamo koliko redova i kolona korisnik zeli da matrice imaju
		int row = input.nextInt();
		int column = input.nextInt();
		// kreiramo matricu a
		System.out.println("Popunite prvu matricu " + row + " x " + column);
		// napravimo matricu
		double[][] a = new double[row][column];
		// sa duplom for petljom popunimo matricu
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				// trazi se u zadatku da sa double vrijednostima popunjavamo
				a[i][j] = input.nextDouble();
			}
		}
		// ispis
		System.out.println("Popunite drugu matricu " + row + " x " + column);
		// kreiramo drugu matricu b
		double[][] b = new double[row][column];
		// popunimo i nju sa duplom for petljom
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				b[i][j] = input.nextDouble();
			}
		}
		// matricu zbir popunimo tako sto pozovemo metodu
		double[][] zbir = addMatrix(a, b);
		// ispis sabrane matrice
		System.out.println("Zbir vase dvije matrice je: ");
		// sa duplom for petljom
		for (int i = 0; i < zbir.length; i++) {
			for (int j = 0; j < zbir[0].length; j++) {
				System.out.print(zbir[i][j] + " ");
			} // prelazak u novi red
			System.out.println();
		} // zatvaramo skener
		input.close();
	}
}
