package zadaci_15_01_2016;

import java.util.Scanner;

public class NajveciZajednickiDjelilac {
	// metoda koja racuna najveci zajednicki djelilac nzd prima dva broja
	public static int NajveciZajednickiDjelilac(int a, int b) {
		// postavimo nzd na nula
		int nzd = 0;
		// krecemo od prvog broja 1 i ispitujemo uslove
		int i = 1;
		// dokle god je i manje od prvog i drugog broja
		while (i <= a && i <= b) {
			// ispitujemo ostatk djeljenja sa i i ako je nula
			if (a % i == 0 && b % i == 0) {
				nzd = i;
			} // povecavamo nzd za jedan
			i++;
		} // metoda vraca nzd
		return nzd;
	}

	public static void main(String[] args) {
		// Napisati metodu koja prima dva cijela broja kao argumente te vraća
		// najveći zajednički djelilac za ta dva broja.

		Scanner input = new Scanner(System.in);
		System.out.println("Unesite dva broja za koja trazite najveci zajednicki djelilac");
		int prvi = input.nextInt();
		int drugi = input.nextInt();
		// unijeli smo dva broja od korisnika tj ocitali i pozivamo metodu da
		// racuna nzd
		System.out
				.println(NajveciZajednickiDjelilac(prvi, drugi) + " je najveci zajednicki djelilac za trazene brojeve");
		input.close();
	}

}
