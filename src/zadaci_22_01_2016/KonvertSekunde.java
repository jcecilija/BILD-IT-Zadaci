package zadaci_22_01_2016;

import java.util.Scanner;

public class KonvertSekunde {

	// metoda
	public static String convertMillis(long milis) {
		// formula kojom dobivamo sekunde
		int sekunde = (int) (milis / 1000) % 60;
		// formula za minute
		int minute = (int) (milis / (1000 * 60)) % 60;
		// formula za sate
		int sati = (int) (milis / (1000 * 60 * 60)) % 24;
		// metoda treba da vrati string ispis
		return sati + ":" + minute + ":" + sekunde;
	}

	public static void main(String[] args) throws ArithmeticException {
		// Napisati metodu koja pretavara milisekunde u sate, minute i sekunde.
		// Metoda treba da koristi sljedeći header: public static String
		// convertMillis(long millis). Metoda treba da vraća vrijeme kao string
		// u formatu sati:minute:sekunde. Na primjer convertMillis(100000) treba
		// da vrati 0:1:40

		// skener da unosimo mi koliko milisekunda
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite milisekunde");
		long milis = input.nextLong();
		// poziv metode i ispis
		System.out.println(convertMillis(milis));
		input.close();
	}

}
