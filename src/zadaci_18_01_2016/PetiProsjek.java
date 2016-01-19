package zadaci_18_01_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class PetiProsjek {

	public static void main(String[] args) {
		// Napisati program koji učitava neodređeni broj cijelih brojeva (nula
		// prekida unos) te ispisuje koliko je brojeva bilo iznad ili jednako
		// prosjeku svih unešenih brojeva a koliko je bilo brojeva ispod
		// prosjeka. Pretpostavimo da je maksimalan niz brojeva koje korisnik
		// može unijeti 100.

		Scanner input = new Scanner(System.in);
		ArrayList<Integer> nizBrojeva = new ArrayList<Integer>();
		System.out.println("Unesite neodredjen broj cijelih brojeva a sa nulom prekidate unos");
		int broj;
		do {// petlja koja nam omogucava unos brojeva sve dok korisnik ne unese
			// 0
			broj = input.nextInt();
			nizBrojeva.add(broj);
		} while (broj != 0);// dokle god je broj razlicit od nule korisnik moze
							// da unosi brojeve u niz
		int prosjek;
		int zbir = 0;
		int brojac = 0;
		for (int i = 0; i < nizBrojeva.size(); i++) {
			zbir = zbir + nizBrojeva.get(i);
			brojac++;
		}
		prosjek = zbir / brojac;
		System.out.println("Prosjek unesenih brojeva je: " + prosjek);
		int jednakih = 0;
		int vecih = 0;
		int manjih = 0;
		for (int a : nizBrojeva) {
			if (a == prosjek) {
				jednakih++;
			}
			if (a > prosjek) {
				vecih++;
			}
			if (a < prosjek) {
				manjih++;
			}
		}
		System.out.println("Od ukupno unijetih brojeva : " + brojac);
		System.out.println("Iznad prosjeka je bilo: " + vecih + " a ispod prosjek: " + manjih
				+ " dok je jednakih sa prosjekom bilo " + jednakih);
		input.close();
	}
}
