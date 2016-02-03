package zadaci_03_02_2016;

public class EvenNumbers1 {

	public static void main(String[] args) {
		// (Even number of 1s) Write a program that generates a 6-by-6
		// two-dimensional
		// matrix filled with 0s and 1s, displays the matrix, and checks if
		// every row and
		// every column have an even number of 1s

		// pravimo matricu 6x6
		int[][] matrix = new int[6][6];
		// sa duplom for petljom je punimo
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				// pomocu math random
				matrix[i][j] = (int) (Math.random() * 2);
				// i odmah je i ispisujemo
				System.out.print(matrix[i][j] + " ");
			} // prelazak u novi red
			System.out.println();
		}
		// inicijalizujemo boolean za paran broj jedinica u redovima
		boolean evenRow = false;
		// sa duplom for petljom prolazimo kroz matiruc
		for (int i = 0; i < matrix.length; i++) {
			// inicijalizujemo brojac sume jedinica za redove
			int counterRow = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				// uslov ako je broj 1
				if (matrix[i][j] == 1) {
					// inkrementiraj
					counterRow++;
				}
			} // uslov ako je brojac za taj red paran
			if (counterRow % 2 == 0) {
				// evenRow postaje true
				evenRow = true;
			}
			// u suprotnom nije paran false
			evenRow = false;
		}
		// inicijalizujemo boolean za paran broj jedinica u koloni
		boolean evenColumn = false;
		// dupla for petlja za prolazak kroz sve redove i kolone
		for (int j = 0; j < matrix[0].length; j++) {
			// inicijalizujemo brojac jedinica u koloni
			int counterColumn = 0;
			for (int i = 0; i < matrix.length; i++) {
				// uslov
				if (matrix[j][i] == 1) {
					// inkrementiraj brojac u koloni
					counterColumn++;
				}
			} // uslov ako je brojac jedinica u kolonama paran
			if (counterColumn % 2 == 0) {
				evenColumn = true;
			}
			evenColumn = false;
		}
		// Uuslov za ispisati na konzoli ako su i red i kolone parni sa brojem
		// jedinica
		if (evenRow == true && evenColumn == true) {
			System.out.println("Matrica u svim redovima i kolonama ima paran broj jedinica!");
		} else
			System.out.println("Matrica nema u svim redovima i kolonama paran broj jedinica!");
	}
}
