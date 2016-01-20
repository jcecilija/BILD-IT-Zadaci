package zadaci_20_01_2016;

import java.util.Scanner;

public class DuzinaPiste {

	public static void main(String[] args) {
		// Ako imamo ubrzanje aviona a te brzinu pri kojoj avion uzlijeće v,
		// možemo izračunati minimalnu dužinu piste potrebne da avion uzleti
		// koristeći se sljedećom formulom: dužina = v * v / 2a. Napisati
		// program koji pita korisnika da unese v u m/s i a u m/s² te ispisuje
		// korisniku minimalnu dužinu piste. (Primjer: ukoliko unesemo 60 za
		// brzinu i 3.5 za ubrzanje dužina piste je 514.286)

		// skener za unos
		Scanner input = new Scanner(System.in);
		// ispisi korisniku poruku
		System.out.println("Unesite brzinu pri kojoj avion uzlijece u m/s");
		// u v smjestamo brzinu
		double v = input.nextDouble();
		// ispis korisniku
		System.out.println("Unesite ubrzanje aviona");
		// smjestamo ubrzanje u a
		double a = input.nextDouble();
		// formula za iyracunavanje i dodjeljujemo tu vrijednost u
		// minDuzinaPiste
		double minDuzinaPiste = (v * v) / (2 * a);
		// ispis
		System.out.println("Minimalna duzina piste je: " + minDuzinaPiste);
		input.close();

	}

}
