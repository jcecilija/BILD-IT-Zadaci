package zadaci_19_01_2016;

import java.util.Scanner;

public class BrojacSlova {
	public static int countLetters(String s) {
		String unos = s.replace(" ", "");// napravimo novi string u koji cemo
											// kopirat nas unos samo bez razmaka
											// izmedju rijeci
		int brojac = unos.length();// brojac ce bit jednak duzini naseg unosa
									// koji smo dobili kada smo uklonili razmake
		return brojac;// metoda vraca brojac tj duzinu
	}

	public static void main(String[] args) {
		// Napisati metodu koja broji slova u stringu. Metoda treba koristiti
		// sljedeći header: public static int countLetters(String s). Napisati
		// program koji pita korisnika da unese neki string te mu vrati koliko
		// taj string ima slova
		Scanner input = new Scanner(System.in);// skener za unos teksta
		System.out.println("Unesite neki tekst");
		String tekst = input.nextLine();// string tekstu dodijeljujemo nas unos
		System.out.println("U vasem tekstu " + tekst + " ima " + countLetters(tekst) + " slova");// ispis
																									// i
																									// poziv
																									// metode
		input.close();// zatvaramo skener

	}
}
