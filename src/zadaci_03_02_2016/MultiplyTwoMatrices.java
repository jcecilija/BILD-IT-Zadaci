package zadaci_03_02_2016;

import java.util.Scanner;

public class MultiplyTwoMatrices {

	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		// pravimo matricu c u koju cemo da smjestamo nas rezultat
		double[][] c = new double[a.length][b[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				// cij = ai1 * b1j + ai2 * b2j + ai3 * b3j.
				// uvodimo nesto kao brojac da mozemo se kretat po kolonama a
				// matrice i redovima b matrice
				int x = 0;
				while (x < b[0].length) {
					c[i][j] = a[i][x] * b[x][j];
					x++;
				}
			}
		} // metoda vraca c matricu [][]
		return c;
	}

	public static void main(String[] args) {
		// (Algebra: multiply two matrices) Write a method to multiply two
		// matrices.
		// To multiply matrix a by matrix b, the number of columns in a must be
		// the same as
		// the number of rows in b, and the two matrices must have elements of
		// the same or
		// compatible types. Let c be the result of the multiplication. Assume
		// the column size
		// of matrix a is n. Each element c
		// ij is ai1 * b1j + ai2 * b2j + c + ain * bnj.
		// skener za unos
		Scanner input = new Scanner(System.in);
		// ispis korisniku
		System.out.println("Unesite velicinu vase matrice a: ");
		// smjestamo korisnikov unos za broj redova a matrice
		int rowA = input.nextInt();
		System.out.println("Unesite broj kolona vase matrice a: ");
		// smjetamo korisnikov unos za broj kolona a matrice
		int columnA = input.nextInt();
		// kreiramo nasu matricu a
		double[][] a = new double[rowA][columnA];
		// ispis korisniku
		System.out.println(
				"Unesite broj kolona matrice b , a broj redova je isti kao broj kolona matrice a da bi se mogle ponoziti:");
		// ovo moraq biti ovako da bi se matrice mogle mnoziti sto se nama i
		// trazi u zadatku
		int rowB = columnA;
		// smjestamo korisnikov unos za broj kolona matrice b
		int columnB = input.nextInt();
		// kreiramo nasu matricu b
		double[][] b = new double[rowB][columnB];
		// da ne bi mi unosi sve brojeve, sa math random cemo popuniti nase
		// matrice i ispisati ih
		System.out.println("Vasa matrica a je: ");
		for (int i = 0; i < rowA; i++) {
			for (int j = 0; j < columnA; j++) {
				a[i][j] = Math.random() * 10;
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		} // popunjavamo i ispisujemo matricu b
		System.out.println("Vasa matrica b je: ");
		for (int i = 0; i < rowB; i++) {
			for (int j = 0; j < columnB; j++) {
				b[i][j] = Math.random() * 5;
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		// nasa nova matrica pozivamo metodu i ispisujemo je
		double[][] c = multiplyMatrix(a, b);
		System.out.println("Nova matrica c koja je proizvod a i b je: ");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[0].length; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		input.close();
	}
}