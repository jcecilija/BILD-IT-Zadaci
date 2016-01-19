package zadaci_19_01_2016;

import java.util.Scanner;

public class ObrnutiBrojevi {

	public static void main(String[] args) {
		// Napisati program koji prima 10 cijelih brojeva te ih ispisuje u
		// obrnutom redosljedu.

		Scanner input = new Scanner(System.in);// skener za unos brojeva sa
												// konzole
		System.out.println("Unesite deset brojeva:");
		int[] nizBrojeva = new int[10];// pravimo niz velicine 10 u koji
										// smjestamo nas unos
		for (int i = 0; i < nizBrojeva.length; i++) {
			nizBrojeva[i] = input.nextInt();
		}
		System.out.println("Vas niz brojeva koje ste unijeli je:");// ispis
																	// brojeva
																	// po redu
																	// kako smo
																	// ih
																	// unijeli
		for (int i = 0; i < nizBrojeva.length; i++) {// sa for petljom
			System.out.print(nizBrojeva[i] + " ");
		}
		System.out.println();// prelazak u novi red da nam je pregledniji ispis
		System.out.println("A brojevi u obrnutom redoslijedu su: ");// brojevi u
																	// obrnutom
																	// redoslijedu
		for (int i = nizBrojeva.length - 1; i >= 0; i--) {// sa for petljom ih
															// ispisujemo al
															// krecemo od
															// zadnjeg ka prvom
			System.out.print(nizBrojeva[i] + " ");
		}
		input.close();// zatvaramo skener
	}

}
