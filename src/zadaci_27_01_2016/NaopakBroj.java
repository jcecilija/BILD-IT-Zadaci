package zadaci_27_01_2016;

import java.util.Scanner;

public class NaopakBroj {
	// metoda
	public static void reverse(int number) {
		// ispis
		System.out.println("Broj " + number + " naopako je: ");
		// inicijalizacija naopakog broja
		int naopako = 0;
		// uslov doj je god broj razlicit od nule radi
		while (number != 0) {
			// mnozimo broj sa 10
			naopako = naopako * 10;
			// da bi mogli traziti modul 10 od broja i dobit zadnju cifru
			naopako = naopako + number % 10;
			number = number / 10;
		} // ispis
		System.out.print(naopako);
	}

	public static void main(String[] args) {
		// Napišite metodu sa sljedećim headerom koja vraća naopako ispisan broj
		// koji joj je proslijeđen kao argument: public static void reverse(int
		// number). Na primjer, reverse(3456) treba da vrati 6543. Napisati
		// program koji pita korisnika da unese neki cijeli broj te mu vrati
		// isti ispisan naopako.

		// skenr
		Scanner input = new Scanner(System.in);
		// ispis
		System.out.println("Unesite neki broj:");
		int broj = input.nextInt();
		// poziv metode
		reverse(broj);
		// zatvaramo skener
		input.close();
	}
}
