package zadaci_26_01_2016;

import java.util.Scanner;

public class Djelioci {
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

	public static int NajmanjiZajednickiDjelilac(int a, int b) {
		// postavimo minNzd=1
		int minNzd = 0;
		// krecemo od broja 2 provjeru
		int i = 2;
		// uslov dokle god je najmanji zajednicki djelioc jednak nuli trazi
		// sljedeci broj
		while (minNzd == 0) {
			if (a % i == 0 && b % i == 0) {
				minNzd = i;
			} else
				i++;
		}
		// netoda vraca rjesenje
		return minNzd;
	}

	public static void main(String[] args) {
		// Napisati program koji pita korisnika da unese dva cijela, pozitivna
		// broja te ispisuje najveći i najmanji zajednički djelilac za ta dva
		// broja.

		// skener za unos
		Scanner input = new Scanner(System.in);
		// ispis
		System.out.println("Unesite dva cijela broja:");
		// prvi i drugi broj
		int prvi = input.nextInt();
		int drugi = input.nextInt();
		// ispis i poziv metoda
		System.out.println("Najveci zajednicki djelilac za brojeve " + prvi + " i " + drugi + " je "
				+ NajveciZajednickiDjelilac(prvi, drugi));
		System.out.println("Najmanji zajednicki djelilac za brojeve " + prvi + " i " + drugi + " je "
				+ NajmanjiZajednickiDjelilac(prvi, drugi));
		// zatvaramo skener
		input.close();
	}

}
