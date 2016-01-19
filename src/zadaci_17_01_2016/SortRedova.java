package zadaci_17_01_2016;

import java.util.Scanner;

public class SortRedova {

	// Implementirati sljedeću metodu da sortira redove u 2D nizu.
	public static double[][] sortRows(double[][] array) {
		for (int j = 0; j < array[0].length; j++) {// prolazimo kroz redove
													// matrice
			java.util.Arrays.sort(array[j]);// i koristimo metodu za sortiranje
											// po velicini u redu
		}
		return array;// vraca sada sortiran red
	}

	public static void main(String[] args) {

		// Napisati testni program koji pita korisnika da unese 3x3 matricu (ili
		// da pita korisnika koliku matricu želi unijeti) te mu ispisuje na
		// konzoli matricu sa sortiranim redovima - od najmanjeg broja do
		// najvećeg.

		Scanner input = new Scanner(System.in);// skener za unos
		System.out.println("Unesite broj redova i broj kolona u vasem 2D nizu:");
		// korisnik unosi koliko zeli redova i kolona 2Dniz da ima
		int redova = input.nextInt();
		int kolona = input.nextInt();
		double[][] niz = new double[redova][kolona];// kreiramo niz kakav
													// korisnik zeli
		System.out.println("Unesite u niz " + niz.length + "reda i " + niz[0].length + " kolone:");
		// sa dvije for petlje punimo niz unosom od korisnika
		for (int red = 0; red < niz.length; red++) {
			for (int kolone = 0; kolone < niz[red].length; kolone++) {
				niz[red][kolone] = input.nextDouble();// korisnik moze da unosi
														// double vrijednosti
			}
		}
		double[][] sortirano = sortRows(niz);// kreiramo niz i u njega smjestamo
												// ono sto metoda vrati tj
												// sortirane redove
		// sa for petljom ispisujemo sortiran niz
		for (int red = 0; red < niz.length; red++) {
			for (int kolone = 0; kolone < niz[red].length; kolone++) {
				System.out.print(sortirano[red][kolone] + "  ");
			}
			System.out.println();
		}
		input.close();
	}
}