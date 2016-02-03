package zadaci_03_02_2016;

import java.util.Scanner;

public class WeeklyHours {

	public static void main(String[] args) {
		// (Compute the weekly hours for each employee) Suppose the weekly hours
		// for all
		// employees are stored in a two-dimensional array. Each row records an
		// employee’s seven-day work hours with seven columns.
		// For example, the following
		// array stores the work hours for eight employees. Write a program that
		// displays
		// employees and their total hours in decreasing order of the total
		// hours. opadajucem

		// skener za unos sa konzole
		Scanner input = new Scanner(System.in);
		// ispis korisniku
		System.out.println("Unesite koliko imate radnika:");
		// smjestamo korisnikov unos koliko radnika zeli i to nam je broj redova
		int radnici = input.nextInt();
		// broj kolona je broj dana i to je fiksno 7
		final int dani = 7;
		// kreiramo matricu u koju cemo smjestiti radnike i njihove sati po
		// danima
		int[][] matrica = new int[radnici][dani];
		// sa prvom petljom prolazimo kroz svakog radnika
		for (int i = 0; i < radnici; i++) {
			// sa drugom petljom prolazimo kroz dane
			for (int j = 0; j < dani; j++) {
				// ispis korisniku
				System.out.println("Upisite koliko sati je radio " + (i + 1) + " radnik za " + (j + 1) + " dan:");
				// smjestanje korisnikovog unosa
				matrica[i][j] = input.nextInt();
			}
		}
		// napravimo niz u koji cemo smjestat sumu za svakog radnika
		int[] suma = new int[radnici];
		// sa duplom for petljom prolazimo kroz nase radnike i njihove sate po
		// danima
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[0].length; j++) {
				// sabiremo sate od svakog dana i smjstamo u sumu od tog radnika
				suma[i] += matrica[i][j];
			} // ispis na konzoli koliko je koji radnik radio sati po redu kako
				// su radnici uneseni u tabelu
			System.out.println("Suma sati za radnika " + (i + 1) + " je " + suma[i]);
		}
		input.close();
	}
}
