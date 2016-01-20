package zadaci_20_01_2016;

import java.util.Scanner;

public class PrestupneGodine {

	public static void main(String[] args) {
		// Napisati program koji ispisuje sve prijestupne godine, 10 po liniji,
		// u rasponu godina koje korisnik unese. Program pita korisnika da unese
		// početnu godinu, krajnju godinu te ispisuje sve godine u tom rasponu.
		// Razmak između godina treba biti jedan space.

		Scanner input = new Scanner(System.in);// skener za unos sa konzole
		System.out.println("Unesite pocetnu godinu");// ispis korisniku
		int pocetna = input.nextInt();// pocetna godina od koje racunamo
		System.out.println("Unesite krajnju godinu");// ispis korisniku
		int krajnja = input.nextInt();// do koje godine korisnik hoce da racuna
		int brojac = 0;// brojac za po liniji stavimo na nula
		for (int i = pocetna; i <= krajnja; i++) {// petlja for pocinje od
													// pocetne godine do krajnje
			if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0))// uslov za
																// prestupnu
																// godinu
				;
			System.out.print(i + " ");// stampamo prestupnui godinu i razmak
			brojac++;// kada ostampamo jednu godinu brojac uvecavamo za jedan
			if (brojac == 10) {// ako je brojac 10
				System.out.println();// prelazimo u novi red
				brojac = 0;// a brojac postavljamo na nula
			}
		}
		input.close();
	}
}
