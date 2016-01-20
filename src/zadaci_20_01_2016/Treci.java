package zadaci_20_01_2016;

import java.util.Scanner;

public class Treci {
	public static int reverse(int number) {// metoda koja vraca broj naopako
		int naopako = 0;// inicijalizujemo naopako
		while (number != 0) {// dokle je broj razlicit od nula
			naopako = naopako * 10;// naopako mnozimo sa 10
			naopako = naopako + number % 10;// zatim tome dodajemo samog sebe i
											// modul od 10
			number = number / 10;// broj onda podijelimo sa 10 i smjestimo
									// vrijednost u broj
		}
		return naopako;// metoda vraca naopak broj
	}

	public static boolean isPalindrome(int number) {// metoda da li je broj
													// palindrome
		int naopako = reverse(number);// da bi dobili naopak broj pozivamo
										// metodu reverse
		if (number == naopako) {// uslov ukoliko je broj jednak broju naopako
			return true;// vrati true
		} else
			return false;// vrati false
	}

	public static void main(String[] args) {
		// Napisati metode sa sljedećim headerima: public static int reverse(int
		// number) i public static boolean isPalindrome(int number). Prva metoda
		// prima cijeli broj kao argument i vraća isti ispisan naopako. (npr.
		// reverse(456) vraća 654.) Druga metoda vraća true ukoliko je broj
		// palindrom a false ukoliko nije. Koristite reverse metodu da
		// implementirate isPalindrome metodu. Napišite program koji pita
		// korisnika da unese broj te mu vrati da li je broj palindrome ili ne.

		Scanner input = new Scanner(System.in);// skener za unos
		System.out.println("Unesite cijeli broj:");// ispis korisniku
		int number = input.nextInt();// smjestamo unijeti broj
		System.out.println(isPalindrome(number));// poziv metode da li je broj
													// palindrome
		input.close();// input zatvren
	}
}
