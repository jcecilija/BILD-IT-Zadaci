package zadaci_02_02_2016;

import java.util.Scanner;

public class SumaOdredjeneKolone {
	// metoda koja se trazi
	public static double sumColumn(double[][] m, int columnIndex) {
		// inicijalizujemo sumu da je nula
		double suma = 0;
		// sa for petljom prolazimo kroz svaki red u koloni koju smo zadali i
		for (int i = 0; i < m.length; i++) {
			// sabiremo elemente iz te kolone
			suma = suma + m[i][columnIndex];
		}
		// metoda vraca sumu odredjene kolone
		return suma;
	}

	public static void main(String[] args) {
		// (Sum elements column by column) Write a method that returns the sum
		// of all the
		// elements in a specified column in a matrix using the following
		// header:
		// skener za ucitavanje sa konzole
		Scanner input = new Scanner(System.in);
		// ispis
		System.out.println("Unesite broj redova vase matrice:");
		// smjestamo upisani broj za broj redova
		int row = input.nextInt();
		// ispis korisniku
		System.out.println("Unesite broj kolona vase matrice:");
		// smjestamo broj za broj kolona
		int column = input.nextInt();
		// pravimo matricu sa zadanim brojem redova i kolona
		double[][] matrica = new double[row][column];
		// ispis
		System.out.println("Unesite vasu matricu " + row + " X " + column);
		// sa duplom for petljom punimo nasu matricu
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrica[i][j] = input.nextDouble();
			}
		} // ispis korisniku
		System.out.println("Koje kolone zelite sumu:");
		// unos od korisnika
		int kolona = input.nextInt();
		// poziv metode i stampanje onog sto metoda vraca
		System.out.println("Suma svih brojeva u koloni " + kolona + " je: " + sumColumn(matrica, kolona));
		// zatvaramo skener
		input.close();
	}
}
