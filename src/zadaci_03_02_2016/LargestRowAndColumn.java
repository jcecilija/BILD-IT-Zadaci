package zadaci_03_02_2016;

public class LargestRowAndColumn {

	public static void main(String[] args) {
		// (Largest row and column) Write a program that randomly fills in 0s
		// and 1s into
		// a 4-by-4 matrix, prints the matrix, and finds the first row and
		// column with the
		// most 1s. Here is a sample run of the program:

		// kreiramo matricu
		int[][] matrix = new int[4][4];
		// sa duplom for petljom prolazimo kroz nju
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				// i punimo je sa math random
				matrix[i][j] = (int) (Math.random() * 2);
				// ispisujemo odmah matricu
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		// postavimo da je nulta pozicija kao brojac za jedinice
		int counter = 0;
		// postavimo na nula da je kao suma kolone koja nam se trazi sa najvise
		// jedinica
		int firstRow1 = matrix[0][0];
		int indexRow = 0;
		// sa for petljom prolazimo kroz redove matrice
		for (int column = 0; column < matrix.length; column++) {
			// prolazimo kroz svaki red u coloni column
			for (int row = 0; row < matrix[column].length; row++) {
				counter += matrix[column][row];
			}
			// uslov ako je brojac veci od naseg pocetnog kao najveceg broja
			// jedinica
			if (counter > firstRow1) {
				// onda nas firstColumn1 postaje counter
				firstRow1 = counter;
				// a broj kolone koja prva ima najvise jedinica je
				indexRow = column;
			}
			counter = 0;
		}
		System.out.println("Red koji ima prvi najvise jedinica je " + indexRow);
		// sada za redove postavljamo ponovo brojac na nula
		int counter1 = 0;
		// postavimo kao nulta pozicija za trazenje najveceg reda sa jedninicama
		int firstColumn1 = matrix[0][0];
		// inicijalizujemo index reda sa najvise jedinica da je nula
		int indexColumn = 0;
		// sa duplom for petljom prolazimo kroz svaku kolonu
		for (int row = 0; row < matrix[0].length; row++) {
			// u svakom redu
			for (int column = 0; column < matrix.length; column++) {
				// sabiramo vrijednosti na pozicijama u istom redu
				counter1 += matrix[column][row];
			} // uslov
			if (counter1 > firstColumn1) {
				// nas prvi red sa najvise jedinica postaje counter
				firstColumn1 = counter1;
				// a broj reda koji ima najvise jednica je taj red
				indexColumn = row;
			} // brojac vracamo na nultu poziciju
			counter1 = 0;
		} // ispis
		System.out.println("Kolona koja prva ima najvise jedinica je " + indexColumn);
	}
}
