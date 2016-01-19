package zadaci_17_01_2016;

import java.util.Scanner;

public class PrintaBrojeve {

	public static void Print(int pocetni, int krajnji, int brojacPoLiniji) {
		int brojac = 0;//brojac prostih treba nam poslije za 
		for (int i = pocetni; i < krajnji; i++) {
			boolean isPrime = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				brojac++;
				if (brojac % brojacPoLiniji == 0) {
					System.out.println(i);
				} else {
					System.out.print(i + " ");
				}
			}
		}
	}

	public static void main(String[] args) {
		// Napisati metodu koja prima 2 argumenta: početni broj i krajnji broj
		// te printa sve proste brojeve u zadanom rangu.
		// BONUS: metoda može primati i treći argument, broj brojeva za
		// isprintati po liniji. Broj je prost samo ako je djeljiv bez ostatka
		// samo sa 1 i samim sobom
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite pocetni i kranji broj u cijem intervalu trazimo proste brojeve!");
		int pocetni = input.nextInt();
		int krajnji = input.nextInt();
		System.out.println("Unesite koliko prostih brojeva po liniji zelite da se ispise");
		int brojacPoLiniji = input.nextInt();
		Print(pocetni, krajnji,brojacPoLiniji);
		input.close();
	}
}
