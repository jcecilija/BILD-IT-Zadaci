package zadaci_25_01_2016;

import java.util.Scanner;

public class MinuteUGodine {

	public static void main(String[] args) {
		// Napisati program koji pita korisnika da unese broj minuta (npr. 1
		// milijardu) te ispiše korisniku koliko je to u godinama i danima. Zbog
		// jednostavnosti, pretpostavimo da godina ima 365 dana.

		// pravimo skener
		Scanner input = new Scanner(System.in);
		// ispis korisniku
		System.out.println("Unesite broj minuta");
		// ucitavamo minute
		long minute = input.nextLong();
		// dobijamo ukupno sati koliko ima u ucitanim minutama
		long ukupnoSati = minute / 60;
		// dobijamo koliko dana ima ukupno
		long ukupnoDana = ukupnoSati / 24;
		// dobijamo koliko dana kad oduzmemo cijele godine nam ostane
		int dani = (int) ukupnoDana % 365;
		// i koliko godina
		int godina = (int) ukupnoDana / 365;
		// ispis
		System.out.println(minute + " minuta je: " + godina + " godina i " + dani + " dana");
		input.close();
	}
}
