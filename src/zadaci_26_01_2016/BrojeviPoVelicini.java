package zadaci_26_01_2016;

import java.util.Arrays;
import java.util.Scanner;

public class BrojeviPoVelicini {

	// metoda koja ispisuje brojeve u rastucem redu
	public static void Sortiraj(int a, int b, int c) {
		// pravimo niz u koji stavljamo po redu unijete brojeve
		int[] niz = new int[3];
		niz[0] = a;
		niz[1] = b;
		niz[2] = c;
		// pozivamo metodu arrays.sort
		Arrays.sort(niz);
		// stampamo svaki broj
		for (int i = 0; i < niz.length; i++) {
			System.out.println(niz[i] + " ");
		}
	}

	public static void main(String[] args) {
		// Napisati program koji pita korisnika da unese 3 cijela broja te mu
		// ispiše ta ista tri broja u rastućem redosljedu. Bonus: Napisati
		// metodu koja prima tri cijela broja kao argumente te vraća brojeve u
		// rastućem redosljedu.

		// skenre za unos
		Scanner input = new Scanner(System.in);
		// ispis
		System.out.println("Unesite tri cijela broja:");
		// smjestanje unosa u promjenjljive
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		// poziv metode koja vraca i stampa brojeve
		Sortiraj(a, b, c);
		input.close();
	}

}
