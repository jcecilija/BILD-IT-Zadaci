package zadaci_16_01_2016;

import java.util.Scanner;

public class Matrica {

	public static void printMatrix(int n) {
		int[][] matrica = new int[n][n];
		for (int row = 0; row < n; row++) {
			for (int column = 0; column < n; column++) {
				matrica[row][column] = (int) (Math.random() * 2);
				System.out.print(matrica[row][column] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// Napisati metodu koja ispisuje n x n matricu korsiteći sljedeći
		// header:
		// Svaki element u matrici je ili 0 ili 1, generisan nasumično. Napisati
		// test program koji pita korisnika da unese n te ispisuje n x n
		// matricu.
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj koliko redova i kolona zelite?");
		int n = input.nextInt();
		printMatrix(n);
		input.close();
	}

}
