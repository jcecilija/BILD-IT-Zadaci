package zadaci_18_01_2016;

import java.util.Scanner;

public class Treci {
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		// pravimo niz u koji smjestamo svoje brojeve po redu kako ih korisnik
		// unese
		double[] niz = new double[3];
		boolean a;
		niz[0] = num1;
		niz[1] = num2;
		niz[2] = num3;
		// ispis originalnog niza
		System.out.println("Originalni niz koji ste unijeli je:");
		for (int i = 0; i < 3; i++) {
			System.out.println(niz[i]);
		}
		// sa do while petljom soritiramo brojeve bubble sort od najmanjeg do
		// najveceg
		do {
			a = false;
			for (int i = 0; i < niz.length - 1; i++) {
				if (niz[i] > niz[i + 1]) {// ako je broj na poziciji i veci od
											// onog na i+1, onda im mjenjamo
											// mjesta
					// zamijeniti pozicije niz[i] i niz[i+1]
					double temp = niz[i];// koristimo privremenu temp kao trecu
											// varijablu za smjestanje
											// privremeno vrijednosti
					niz[i] = niz[i + 1];
					niz[i + 1] = temp;
					a = true;
				}
			}
		} while (a);
		// ispisati nakon Bubble sorta
		System.out.println(" Sortirani brojevi su: ");
		// for ic petlja za ispis svakog sortiranog clana niza
		for (double b : niz) {
			System.out.println(b + " ");
		}
	}

	public static void main(String[] args) {
		// Napisati metodu sa sljedećim headerom koja ispisuje tri broja u
		// rastućem redosljedu: . Napisati program koji pita korisnika
		// da unese tri broja te ispiše ta tri broja u rastućem redosljedu.
		Scanner input = new Scanner(System.in);
		// koristimo skener da ucitamo od korisnika tri broja
		System.out.println("Unesite 3 decimalna broja ");
		double prvi = input.nextDouble();
		double drugi = input.nextDouble();
		double treci = input.nextDouble();
		// pozivamo metodu za sortiranje ta tri broja od najmanjeg ka najvecem
		// koja ih i stampa
		displaySortedNumbers(prvi, drugi, treci);
		input.close();
	}

}
