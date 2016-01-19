package zadaci_17_01_2016;

import java.util.Scanner;

public class NajmanjiDouble {

	public static double min(double[] array) {
		double brojNajmanji = array[0];// postavimo nulti clan niza kao da je
										// minimum
		for (int i = 1; i < array.length; i++) {// prolazimo sa for petljom kroz
												// sve clanove niza
			if (array[i] < brojNajmanji) {// ako je i-ti clan niza manji od
											// najmanjeg onda najmanji postaje
											// taj i-ti clan
				brojNajmanji = array[i];
			}
		}
		return brojNajmanji;// metoda treba da vrati najmanji
	}

	public static void main(String[] args) {
		// Napisati metodu koja nalazi najmanji element u nizu decimalnih
		// vrijednosti koristeći se sljedećim headerom:
		// Napišite potom test program koji pita korisnika da unese deset
		// brojeva te poziva ovu metodu da vrati najmanji element u nizu.
		Scanner input = new Scanner(System.in);// Skener za unos
		System.out.println("Unesite deset double brojeva u niz");
		double[] niz = new double[10];// napravimo niz za brojeve
		for (int i = 0; i < niz.length; i++) {// sa for unosimo u niz brojeve
			niz[i] = input.nextDouble();
		}
		System.out.println("Najmanji clan niza je : " + min(niz));// pozivamo
																	// metodu i
																	// ispisujemo
																	// najmanji
		input.close();
	}

}
