package zadaci_26_01_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class BrojacUnosa {

	public static void main(String[] args) {
		// Napisati program koji učitava cijele brojeve u rasponu od 1 do 100 te
		// broji i ispisuje koliko je koji broj puta unijet. Pretpostavimo da
		// 23 42 58 2 6 0 program nam ispisuje da se broj 2 ponavlja 2 puta,
		// broj 5 jednom, broj 6 2 puta, broj 23 jednom, itd

		Scanner input = new Scanner(System.in);
		System.out.println("Unesite cijele brojeve u rasponu od 1 do 100, a nulom prekidate unos");
		// pravimo array zato sto ne znamo koliko ce bit unosa
		ArrayList<Integer> brojevi = new ArrayList<Integer>();
		// unosimo broj i dodajemo gau listu
		int broj = input.nextInt();
		brojevi.add(broj);
		// dokle god ne unesemo nulu unosimo brojeve i dodajemo u listu
		while (broj != 0) {
			System.out.println("Unesite drugi broj:");
			broj = input.nextInt();
			brojevi.add(broj);
		}
		// napravimo jednu listu u kojoj ima 100 brojeva
		int[] listaZaBrojanje = new int[100];
		// sa for petljom prolazimo kroz svaki broj naseg niza
		for (int i = 1; i < 100; i++) {
			// a tako i kroz arraz sa unijetim brojevima
			for (int j = 0; j < brojevi.size(); j++) {
				// ako nam unijeti broj odgovara indeksu u nasem nizu onda
				if (listaZaBrojanje[i] == brojevi.get(j)) {
					// povecavamo vrijednost na tom indexu za jedan
					listaZaBrojanje[i]++;
				}
			}
		} // sa druge dvije for petlje bi trebalo da ispisemo to ali mislim da
			// mi fali jos jedan niz ovdje neki
		for (int i = 0; i < brojevi.size(); i++) {
			for (int j = 1; j < listaZaBrojanje.length; j++)
				if (brojevi.get(i) == listaZaBrojanje[j]) {
					System.out.println(" Broj" + brojevi.get(i) + " se ponovio " + listaZaBrojanje[j] + " puta");
				}
			continue;
		}
	}
}// zadatak nije zavrsen kako treba, ovo je samo pokusaj
