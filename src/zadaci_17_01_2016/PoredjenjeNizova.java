package zadaci_17_01_2016;

import java.util.Scanner;

public class PoredjenjeNizova {
//metoda
	public static boolean equals(int[] niz1, int[] niz2) {
		for (int i = 0; i < niz1.length; i++) {//sa for petljom prolazimo kroz nizove
			if (niz1[i] != niz2[i])//i poredimo svaki elemenat niza na istim indexima
				;
			{
				return false;//ukoliko nisu jednaki vrati false
			}
		}
		return true;//vrati true ako su jednaki
	}

	public static void main(String[] args) {
		// Nizovi niz1 i niz2 su striktno identični ukoliko su svi njihovi
		// elementi na istim pozicijama jednaki.
		// Napisati metodu koja vraća true ukoliko su nizovi niz1 i niz2
		// striktno identični. Koristiti sljedeći header:

		// Napisati testni program koji pita korisnika da unese dva niza cijelih
		// brojeva te provjerava da li su striktno identični
		Scanner input = new Scanner(System.in);//skener za unos
		int[] niz1 = new int[10];//inicijalizacija prvog niza
		int[] niz2 = new int[10];//inicijalizacija drugog niza
		System.out.println("Unesite deset brojeva u prvi niz");
		for (int i = 0; i < niz1.length; i++) {
			niz1[i] = input.nextInt();//uz pomoc fora punimo prvi niz
		}
		System.out.println("Unesite deset brojeva u drugi niz");
		for (int i = 0; i < niz2.length; i++) {
			niz2[i] = input.nextInt();//uz for punimo i drugi niz
		}
		System.out.println(equals(niz1, niz2));//poziv metode i ispis
		input.close();
	}
}
