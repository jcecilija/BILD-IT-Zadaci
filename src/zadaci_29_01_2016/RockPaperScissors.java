package zadaci_29_01_2016;

import java.util.Scanner;

public class RockPaperScissors {

	// metoda za provjeru koja prima dva broja
	public static void Provjera(int program, int korisnik) {
		// cisto nak napisala da mi je lakse poredit slucajeve
		int papir = 0;
		int kamen = 1;
		int makaze = 2;
		// uslovi a u zadatku sam razumila da prvo ide program pa onda korisnik
		// kao drugi
		if (program == papir) {
			if (korisnik == papir) {
				System.out.println("Nerijeseno!");
			} else if (korisnik == kamen) {
				System.out.println("Izgubio si!");
			} else if (korisnik == makaze) {
				System.out.println("Pobijedio se!");
			}
		} // uslovi ako je program izabrao kamen
		if (program == kamen) {
			if (korisnik == papir) {
				System.out.println("Pobijedio si");
			} else if (korisnik == kamen) {
				System.out.println("Nerijeseno!");
			} else if (korisnik == makaze) {
				System.out.println("Izgubio si");
			}
		} // uslovi ako je program izabrao makaze
		if (program == makaze) {
			if (korisnik == papir) {
				System.out.println("Izgubio si!");
			} else if (korisnik == kamen) {
				System.out.println("Pobijedio si!");
			} else if (korisnik == makaze) {
				System.out.println("Nerijeseno!");
			}
		}
	}

	public static void main(String[] args) {
		// Napisati program koji igra sa protivnikom rock-paper-scissors.
		// (papir-bunar-makaze ili tako nekako po naški) Program nasumično
		// generiše brojeve 0, 1 i 2 koji predstavljaju papir, bunar i makaze.
		// Program pita korisnika da unese 0, 1 ili 2 te mu ispisuje poruku da
		// li je korisnik pobijedio, da li je računar pobijedio ili je bilo
		// neriješeno.
		// program nasumicno sa math random bira jedan broj 0,1 ili 2
		int program = (int) (Math.random() * 3);
		// skener za korisnikov unos
		Scanner input = new Scanner(System.in);
		// ispis korisniku
		System.out.println("Unesite 0 za papir, 1 za kamen ili 2 za makaze!");
		// smjestamo korisnikov unos
		int korisnik = input.nextInt();
		System.out.println("Program je birao " + program);
		// poziv metode za provjeru
		Provjera(program, korisnik);
		input.close();
	}
}
