package zadaci_01_02_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class JedinstveniBrojevi {

	public static void main(String[] args) {
		// Napisati program koji učitava 10 brojeva te ispisuje koliko je
		// jedinstvenih brojeva unijeto te sve jedinstvene brojeve koji su
		// unijeti, razmaknute jednim spaceom. Ukoliko se neki broj pojavljuje
		// više puta, broj treba ispisati samo jednom.

		// skener za ucitavanje brojeva
		Scanner input = new Scanner(System.in);
		// ispis korisniku
		System.out.println("Unesite 10 brojeva");
		// niz od 10 brojeva
		int[] brojevi = new int[10];
		// sa for petljom unosimo brojeve u niz
		for (int i = 0; i < 10; i++) {
			brojevi[i] = input.nextInt();
		}
		int brojacduplih = 0;
		// pravimo array listu u koju cemo smjetat jedinstvene brojeve
		ArrayList<Integer> jedinstveni = new ArrayList<Integer>();
		// sa for petljom prolazimo kroz sve brojeve u nizu
		for (int i = 0; i < brojevi.length; i++) {
			// sa drugom for petljom poredimo onaj gore broj koji smo uzeli sa
			// svim ostalima u nizu
			for (int k = 0; k < jedinstveni.size(); k++) {
				// ako su isti brojevi u jedinstvenom nizu i nasem
				if (brojevi[i] == jedinstveni.get(k)) {
					// povecavamo brojac duplih koji je bio postavljen na nula
					brojacduplih++;
				}
			} // ako je brojac duplih nula
			if (brojacduplih == 0) {
				// onda taj broj dodajemo u listu jedinstvenih
				jedinstveni.add(brojevi[i]);
			}
		} // ispis
		System.out.println("Jedinstvenih brojeva je: " + jedinstveni.size());
		// ispis svih jedinstvenih sa razmakom
		for (Integer s : jedinstveni) {
			System.out.print(s + " ");
		}
		input.close();
	}
}