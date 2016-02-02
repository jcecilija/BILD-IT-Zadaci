package zadaci_02_02_2016;

import java.util.Scanner;

public class ConsecutiveFours {

	// trazena metoda
	public static boolean isConsecutiveFour(int[] values) {
		// brojac na 1 inicijalizujemo
		int brojac = 1;
		// sa for petljom prolazimo kroz niz i poredimo
		for (int i = 0; i < values.length - 1; i++) {
			// ako su dva ista
			if (values[i] == values[i + 1]) {
				// inkrementiramo brojac
				brojac++;
				// ako je brojac =4 onda prekidamo petlju jer nam je trazeni
				// uslov ispunjen
				if (brojac == 4) {
					break;
				}
			}
		}
		// ako je brojac 4
		if (brojac == 4) {
			// metoda vraca true
			return true;
		} else {
			// u suprotnom vraca false
			return false;
		}
	}

	public static void main(String[] args) {
		// (Pattern recognition: consecutive four equal numbers) Write the
		// following method that tests whether the array has four consecutive
		// numbers with
		// the same value.
		// Write a test program that prompts the user to enter a series of
		// integers and displays if the series contains four consecutive numbers
		// with the same value. Your program should first prompt the user to
		// enter the input size—i.e.,
		// the number of values in the series.

		// skener
		Scanner input = new Scanner(System.in);
		// ispis
		System.out.println("Unesite velicinu niza:");
		// prima velicinu niza
		int size = input.nextInt();
		// kreiranje niza u koji cemo da smjestamo nase brojeve
		int[] niz = new int[size];
		// ispis
		System.out.println("Unesite " + size + " cijelih brojeva");
		// sa for petljom punimo niz
		for (int i = 0; i < size; i++) {
			niz[i] = input.nextInt();
		}
		// pozivamo metodu i ako je true
		if (isConsecutiveFour(niz)) {
			// ispis
			System.out.println("The list has consecutive fours");
		} else
			System.out.println("The list has no consecutive fours");
		input.close();
	}
}
