package zadaci_22_01_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class NajveciUnijeti {

	public static void main(String[] args) {
		// Napišite program koji učitava neodređen broj cijelih brojeva (unos
		// prekida nula), pronalazi najveći od unijetih brojeva te ispisuje
		// koliko se najveći broj puta ponovio. Na primjer, ukoliko unesemo 3 5
		// 2 5 5 5 0 program ispisuje da je najveći broj 5 te ispisuje da se
		// isti ponavlja 4 puta.

		Scanner input = new Scanner(System.in);
		// ispis korisniku
		System.out.println("Unosite cijele brojeve a nulu za prekid!");
		// kreiramo aray za unos brojeva zato sto ne znamo koliko ce brojeva bit
		ArrayList<Integer> brojevi = new ArrayList<Integer>();
		// smjestamo broj
		int broj = input.nextInt();
		// brojeve u array
		brojevi.add(broj);
		// uslov
		while (broj != 0) {
			System.out.println("Unesite sljedeci broj");
			broj = input.nextInt();
			// uslov da smjestamo brojeve u array
			if (broj != 0) {
				brojevi.add(broj);
			}
		}
		// pravimo niz brojeva gdje kopiramo sve brojeve sa for petljom
		int[] najvecih = new int[brojevi.size()];
		for (int i = 0; i < brojevi.size(); i++) {
			najvecih[i] = brojevi.get(i);
		}
		// postavljamo jedan na nultoj poziciji da je najveci
		int max = najvecih[0];
		for (int i = 0; i < najvecih.length; i++) {
			// i prolazec kroz niz poredimo
			if (max < najvecih[i])
				// i dobijamo najveci
				max = najvecih[i];
		}
		// brojac za najveci
		int brojac = 0;
		// ponovo kroz niz
		for (int i = 0; i < najvecih.length; i++) {
			if (najvecih[i] == max)
				// brojac uvecavamo ako je uslov ispunjen
				brojac++;
		}
		// ispis
		System.out.println("Najveci broj je: " + max + " a ponovio se: " + brojac + " puta");
		input.close();
	}
}
